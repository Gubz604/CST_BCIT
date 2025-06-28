package q2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class TimeSheet {
    private String empNum;
    private LocalDate endWeek;           // always a Friday
    private List<TimesheetRow> details = new ArrayList<>();

    public TimeSheet() { }

    /** adjust given date to next or same Friday */
    public TimeSheet(String empNum, LocalDate endWeek) {
        this.empNum = empNum;
        if (endWeek != null) {
            // shift to the Friday of that week (or same day)
            LocalDate friday = endWeek.with(
                 TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
            this.endWeek = friday;
        }
    }

    public String getEmpNum() { return empNum; }
    public void setEmpNum(String e) { empNum = e; }

    public LocalDate getEndWeek() { return endWeek; }
    public void setEndWeek(LocalDate d) {
        if (d != null && d.getDayOfWeek() != DayOfWeek.FRIDAY) {
            throw new IllegalArgumentException("endWeek must be a Friday");
        }
        this.endWeek = d;
    }

    public List<TimesheetRow> getDetails() { 
        return details; 
    }
    public void setDetails(List<TimesheetRow> list) {
        details = list;
    }

    /** append a row */
    public void addRow(TimesheetRow row) {
        details.add(row);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append("TimeSheet for Emp# ").append(empNum)
            .append(", week ending ").append(endWeek).append("\n");
        for (TimesheetRow row : details) {
            sb.append("  ").append(row).append("\n");
        }
        return sb.toString();
    }

    /** quick CLI smoke‐test */
    public static void main(String[] args) {
        TimeSheet ts = new TimeSheet("E1234", LocalDate.now());
        ts.addRow(new TimesheetRow(101, "A1", 3.2f,1.1f,4.5f,5.5f,3.2f,2f,5f));
        ts.addRow(new TimesheetRow(102, "B7", 8f,8f,8f,8f,8f,0f,0f));
        ts.addRow(new TimesheetRow(103, "C3", 0f,0f,2f,2f,2f,2f,2f));
        System.out.println(ts);
    }
}
