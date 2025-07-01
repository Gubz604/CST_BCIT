package ca.bcit.comp2522.lab03;

public class IPhone16 extends IPhone
{
    // A tolerance for comparison when comparing numMinsRemaining
    private static final double EPSILON = 1e-6;
    // Used in the hashCode() method to reverse the Epsilon
    private static final int REVERSE_EPSILON = 1_000_000;

    private final boolean highResCamera;
    private final int memoryGigs;

    public IPhone16(final double numMinsRemaining,
                    final String carrier,
                    final boolean highResCamera,
                    final int memoryGigs)
    {
        super(numMinsRemaining, carrier);
        this.highResCamera = highResCamera;
        this.memoryGigs = memoryGigs;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * Two IPhone16 objects are considered equal if they are of the same class
     * and have the same number of minutes remaining on their phone plans AND
     * if they both have a high res camera or not.
     * </p>
     *
     * @param obj the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument;
     *         {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (obj == null) { return false; } // this is definitely not equal to null
        if (!(obj.getClass().equals(this.getClass()))) { return false; } // these aren't the same class
        IPhone16 other = (IPhone16) obj;
        return
            Math.abs(this.getNumMinsRemaining() - other.getNumMinsRemaining()) <
                EPSILON && highResCamera == other.highResCamera;
    }

    /**
     * Returns a hash code value for the object.
     * <p>
     * This method returns a hash code based on the number of minutes remaining
     * on the phone plan, ensuring consistency with the {@link #equals(Object)}
     * method, using a comparison tolerant to floating-point precision issues.
     * </p>
     *
     * @return a hash code value for this IPhone16
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(Math.round(getNumMinsRemaining() *
                                              REVERSE_EPSILON)); // based on EPSILON
    }

    @Override
    public String toString()
    {
        return super.toString() +
            "\nDoes this Iphone 16 have a High Resolution Camera: " +
            highResCamera + "\nMemory in Gigabytes: " + memoryGigs;
    }
}
