package ca.bcit.comp2522.lab03;

public class IPhone extends IDevice
{
    // A tolerance for comparison when comparing numMinsRemaining
    private static final double EPSILON = 1e-6;
    // Used in the hashCode() method to reverse the Epsilon
    private static final int REVERSE_EPSILON = 1_000_000;

    private final double numMinsRemaining;
    private final String carrier;

    public IPhone(final double numMinsRemaining,
                  final String carrier)
    {
        super("Talking");
        this.numMinsRemaining = numMinsRemaining;
        this.carrier = carrier;
    }

    /**
     * Returns the number of minutes remaining on the phone plan.
     *
     * @return The number of minutes remaining on the phone plan.
     */
    public double getNumMinsRemaining() { return numMinsRemaining; }

    /**
     * Prints the details of this IPhone.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Number of Minutes Remaining on the phone plan: " +
                               numMinsRemaining + "\nCarrier: " + carrier);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * Two IPhone objects are considered equal if they are of the same class
     * and have the same number of minutes remaining on their phone plans.
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
        IPhone other = (IPhone) obj;
        return
            Math.abs(this.numMinsRemaining - other.numMinsRemaining) < EPSILON;
    }

    /**
     * Returns a hash code value for the object.
     * <p>
     * This method returns a hash code based on the number of minutes remaining
     * on the phone plan, ensuring consistency with the {@link #equals(Object)}
     * method, using a comparison tolerant to floating-point precision issues.
     * </p>
     *
     * @return a hash code value for this IPhone
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(Math.round(numMinsRemaining * REVERSE_EPSILON)); // based on EPSILON
    }

    /**
     * Returns this IPhone's instance variables as a string.
     *
     * @return A string of the IPad's instance variables.
     */
    @Override
    public String toString()
    {
        return super.toString() +
            "\nNumber of Minutes Remaining on the phone plan: " +
            numMinsRemaining + "\nCarrier: " + carrier;
    }
}
