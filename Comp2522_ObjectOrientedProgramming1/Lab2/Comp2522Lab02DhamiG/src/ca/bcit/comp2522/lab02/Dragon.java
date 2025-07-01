package ca.bcit.comp2522.lab02;

/**
 * Represents the subclass Dragon that inherits from the Creature class. A
 * Dragon has additional Fire Power and methods to breathe fire and restore
 * firepower.
 *
 * <p>This class provides a valid Dragon.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-30
 */
public class Dragon
    extends Creature
{
    // Damage value of the firepower
    private static final int FIREPOWER_DAMAGE = 20;
    // Minimum firepower
    private static final int MIN_FIREPOWER = 0;
    // Maximum firepower
    private static final int MAX_FIREPOWER = 100;
    // Firepower minimum threshold
    private static final int FIREPOWER_THRESHOLD = 10;

    // Amount of damage a Dragon can do
    private int firePower;

    /**
     * Creates Dragon with a name, date of birth, health, and firepower.
     *
     * @param name The name of the Dragon.
     * @param dob The date of birth of the Dragon.
     * @param health The health of the Dragon.
     * @param firePower The firepower of the dragon.
     * @throws IllegalArgumentException If firepower is negative or greater than
     *                                  100.
     */
    public Dragon(final String name,
                  final Date dob,
                  final int health,
                  final int firePower)
        throws IllegalArgumentException
    {
        super(name, dob, health);
        if (firePower < MIN_FIREPOWER || firePower > MAX_FIREPOWER)
        {
            throw new IllegalArgumentException(
                "Fire power must be between 0 and 100");
        }
    }

    /**
     * The amount of damage the Dragon can cause.
     *
     * @return The amount of firepower damage caused by the Dragon.
     * @throws LowFirePowerException If firepower has dropped below the
     *                               firepower threshold.
     */
    public int breathFire()
        throws LowFirePowerException
    {
        if (firePower < FIREPOWER_THRESHOLD)
        {
            throw new LowFirePowerException(
                "Fire power must be at least 10");
        }
        else
        {
            firePower -= FIREPOWER_THRESHOLD;
        }
        return FIREPOWER_DAMAGE;
    }

    /**
     * Brings the firepower back up by some amount after it has diminished.
     *
     * @param firePower The amount the Dragon's firepower will be restored.
     */
    public void restoreFirePower(final int firePower)
    {
        if (firePower < MIN_FIREPOWER) return;
        else if (firePower > MAX_FIREPOWER) this.firePower = MAX_FIREPOWER;
        else this.firePower = firePower;
    }

    /**
     * Prints the details of the Dragon.
     */
    @Override
    public void getDetails()
    {
        super.getDetails();
        System.out.println("\nFire power: " + firePower);
    }

    /**
     * Exception thrown when the Dragon's firepower is
     */
    public static class LowFirePowerException extends Exception
    {
        public LowFirePowerException(final String message)
        {
            super(message);
        }
    }
}