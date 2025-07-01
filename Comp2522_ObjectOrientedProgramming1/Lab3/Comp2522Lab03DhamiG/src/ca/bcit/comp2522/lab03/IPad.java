package ca.bcit.comp2522.lab03;

/**
 * Represents the subclass IPad that inherits form the IDevice class. The Ipad
 * additionally either has a case or not and also has an operating system.
 *
 * <p>This class produces a valid IPad device.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-30
 */
public class IPad extends IDevice
{
    // Boolean for if the Ipad has a case or note
    private final boolean hasCase;
    // The operating system of the IPad
    private final String operatingSystem;

    /**
     * Creates a new IPad with the purpose of Learning as well as a boolean for
     * if it has a case and an operating system.
     *
     * @param hasCase A boolean for if the IPad has a case.
     * @param operatingSystem The operating system of the IPad.
     */
    public IPad(final boolean hasCase,
                final String operatingSystem)
    {
        super("Learning");
        this.hasCase = hasCase;
        this.operatingSystem = operatingSystem;
    }

    /**
     * Prints the details of this IPad.
     */
    @Override
    public void printDetails()
    {
        System.out.println("This iPad has a case: " + hasCase +
            "\nOperating System: " + operatingSystem);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * Two IPod objects are considered equal if they are of the same class
     * and have the same operating system.
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
        IPad other = (IPad) obj;
        return this.operatingSystem.equals(other.operatingSystem);
    }

    /**
     * Returns a hash code value for the object.
     * <p>
     * This method returns a hash code based on the operating system,
     * ensuring consistency with the {@link #equals(Object)} method.
     * </p>
     *
     * @return a hash code value for this IPod
     */
    @Override
    public int hashCode()
    {
        return operatingSystem.hashCode();
    }

    /**
     * Returns this IPad's instance variables as a string.
     *
     * @return A string of the IPad's instance variables.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nThis iPad has a case: " + hasCase +
            "\nOperating System: " + operatingSystem;
    }
}
