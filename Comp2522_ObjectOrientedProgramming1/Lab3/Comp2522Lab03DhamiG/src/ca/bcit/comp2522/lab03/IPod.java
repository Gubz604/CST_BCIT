package ca.bcit.comp2522.lab03;

/**
 * Represents the subclass IPod that inherits form the IDevice class. The Ipod
 * additionally has a number of songs as well as a maximum volume measured in
 * decibels.
 *
 * <p>This class produces a valid IPod device.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-30
 */
public class IPod extends IDevice
{

    // Number of songs in the IPod
    private final int numSongs;
    // Maximum amount of volume in decibels
    private final double maxVolumeDecibels;

    /**
     * Creates a new IPod device with the Purpose of music as well as a number
     * of songs and a max volume measured in decibels.
     *
     * @param numSongs The number of songs.
     * @param maxVolumeDecibels The maximum amount of volume measured in
     *                          decibels.
     */
    public IPod(final int numSongs,
                final double maxVolumeDecibels)
    {
        super("Music");
        this.numSongs = numSongs;
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    /**
     * Prints the details of this IPod.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Number of Songs: " + numSongs +
            "\nMax Volume Decibels: " + maxVolumeDecibels);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * Two IPod objects are considered equal if they are of the same class
     * and have the same number of songs.
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
        IPod other = (IPod) obj;
        return this.numSongs == other.numSongs;
    }

    /**
     * Returns a hash code value for the object.
     * <p>
     * This method returns a hash code based on the number of songs,
     * ensuring consistency with the {@link #equals(Object)} method.
     * </p>
     *
     * @return a hash code value for this IPod
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(numSongs);
    }

    /**
     * Returns the ca.bcit.comp2522.lab03.IPod's instance variables as a string.
     *
     * @return A string of the ca.bcit.comp2522.lab03.IPod's instance variables.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nNumber of songs: " +
            numSongs + "\nMax volume in decibels: " + maxVolumeDecibels;
    }
}
