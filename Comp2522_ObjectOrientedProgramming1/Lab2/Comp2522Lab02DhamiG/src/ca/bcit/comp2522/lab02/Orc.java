package ca.bcit.comp2522.lab02;

/**
 * Represents the subclass Orc that inherits from the Creature class. An Orc has
 * rage that increases per Berserk attack and will amplify attack after a
 * certain amount rage built-up.
 *
 * <p>This class provides a valid Orc Creature.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-30
 */
public class Orc
    extends Creature
{
    // Damage dealt by berserk
    private static final int BERSERK_DAMAGE = 15;
    // Berserk damage multiplier
    private static final int BERSERK_MULTIPLIER = 2;
    // Increases amount of rage after each berserk damage
    private static final int RAGE_INCREASE = 5;
    // Minimum amount of rage
    private static final int MIN_RAGE = 0;
    // Maximum amount of rage
    private static final int MAX_RAGE = 30;
    // Amount of rage threshold
    private static final int RAGE_THRESHOLD = 20;

    // Amount of Rage the Orc has
    private int rage;

    /**
     * Creates a valid Orc Creature with a name, date of birth, health, and
     * rage.
     *
     * @param name The name of the Orc.
     * @param dateOfBirth The date of birth of the Orc.
     * @param health The health of the Orc.
     * @param rage The amount of initial rage of the Orc.
     * @throws IllegalArgumentException If the rage is negative or greater than
     *                                  the max rage allowed.
     */
    public Orc(final String name,
               final Date dateOfBirth,
               final int health,
               final int rage)
        throws IllegalArgumentException
    {
        super(name, dateOfBirth, health);
        if (rage < MIN_RAGE || rage > MAX_RAGE)
        {
            throw new IllegalArgumentException("Rage must be between 0 and 30");
        }
        else this.rage = rage;
    }

    /**
     * The Orc's attack that causes damage. If rage is greater than the rage
     * threshold then the amount of damage is increased by a multiplier amount.
     *
     * @return The amount of damage caused.
     */
    public int berserk()
    {
        if (rage > RAGE_THRESHOLD)
        {
            rage += RAGE_INCREASE;
            return BERSERK_DAMAGE * BERSERK_MULTIPLIER;
        }
        else
        {
            rage += RAGE_INCREASE;
            return BERSERK_DAMAGE;
        }
    }

    /**
     * Prints the details of the Orc
     */
    @Override
    public void getDetails()
    {
        super.getDetails();
        System.out.println("\nRage: " + rage);
    }
}
