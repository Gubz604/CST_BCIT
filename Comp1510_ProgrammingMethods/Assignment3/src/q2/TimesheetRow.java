package q2;

public class TimesheetRow {
    private int project;
    private String workPackage;
    private long hoursPacked = 0L;

    // masks to isolate or clear each byte
    private static final long[] MASK  = {
        0xFFL,                 // Sat (byte 0)
        0xFF00L,               // Sun
        0xFF0000L,             // Mon
        0xFF000000L,           // Tue
        0xFF00000000L,         // Wed
        0xFF0000000000L,       // Thu
        0xFF000000000000L      // Fri (byte 6)
    };
    private static final long[] UMASK = {
        ~MASK[0], ~MASK[1], ~MASK[2],
        ~MASK[3], ~MASK[4], ~MASK[5],
        ~MASK[6]
    };

    public TimesheetRow() { }

    /** 
     * @param project    project number
     * @param workPackage identifier
     * @param dailyHours floats Sat→Fri (length ≤7)
     */
    public TimesheetRow(int project, String workPackage, float... dailyHours) {
        this.project = project;
        this.workPackage = workPackage;
        for (int day = 0; day < dailyHours.length && day < 7; day++) {
            setHour(day, dailyHours[day]);
        }
    }

    // getters/setters for project & workPackage
    public int getProject() { return project; }
    public void setProject(int p) { project = p; }
    public String getWorkPackage() { return workPackage; }
    public void setWorkPackage(String wp) { workPackage = wp; }

    /** raw packed hours */
    public long getHoursPacked() {
        return hoursPacked;
    }
    /** replace entire packed value */
    public void setHoursPacked(long h) {
        this.hoursPacked = h;
    }

    /** get hours for day 0=Sat…6=Fri */
    public float getHour(int day) {
        if (day < 0 || day > 6)
            throw new IndexOutOfBoundsException("Day must be 0–6");
        int scaled = (int)((hoursPacked >> (8*day)) & 0xFF);
        return scaled / 10f;
    }

    /** set hours for day 0=Sat…6=Fri */
    public void setHour(int day, float hrs) {
        if (day < 0 || day > 6)
            throw new IndexOutOfBoundsException("Day must be 0–6");
        if (hrs < 0 || hrs > 24)
            throw new IllegalArgumentException("Hours must be 0.0–24.0");
        int scaled = Math.round(hrs * 10);
        if (scaled < 0 || scaled > 240)
            throw new IllegalArgumentException("Scaled hours out of range");

        // clear that byte, then OR in the new value
        hoursPacked = (hoursPacked & UMASK[day]) 
                    | ((long)(scaled & 0xFF) << (8 * day));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proj ").append(project)
          .append(" / WP ").append(workPackage)
          .append(" → ");
        for (int d = 0; d < 7; d++) {
            sb.append(getHour(d));
            if (d < 6) sb.append(", ");
        }
        return sb.toString();
    }
}
