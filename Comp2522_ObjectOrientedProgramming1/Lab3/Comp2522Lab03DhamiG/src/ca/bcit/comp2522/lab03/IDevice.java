package ca.bcit.comp2522.lab03;

/**
 * An abstract superclass that describes all IDevices.
 * Other iProducts (such as iPhone, iPad, etc.) inherit from this class.
 *
 * <p>
 * This class defines common features of IDevices, including their intended
 * purpose and the requirement to provide specific device details by implementing
 * the {@link #printDetails()} method in subclasses.
 * </p>
 *
 * @author YourName
 * @version 1.0
 * @since 2025-06-30
 */
abstract class IDevice
{
    /** The primary function or purpose of the device. */
    private final String purpose;

    /**
     * Constructs a new IPod with the specified
     * purpose.
     *
     * @param purpose the function or intended use of the device
     * @throws IllegalArgumentException if the purpose is null or empty
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Prints the details of the ca.bcit.comp2522.lab03.IDevice.
     * <p>
     * This method must be implemented by all subclasses to provide
     * device-specific information.
     * </p>
     */
    public abstract void printDetails();

    /**
     * Returns the purpose of the ca.bcit.comp2522.lab03.IDevice.
     *
     * @return the device's purpose as a {@code String}
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Returns a string representation of the ca.bcit.comp2522.lab03.IDevice.
     *
     * @return the purpose of the device
     */
    @Override
    public String toString()
    {
        return "Purpose: " + purpose;
    }
}
