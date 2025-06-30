package ca.bcit.comp2522.lab02;

/**
 * Represents the subclass Elf that inherits from the Creature class. An elf has
 * mana that it will use to cast spells.
 *
 * <p>This class provides a valid Elf.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-30
 */
public class Elf
    extends Creature
{
    // Damage dealt by cast spell
    private static final int SPELL_DAMAGE = 10;
    // Mana threshold for casting a spell
    private static final int MANA_THRESHOLD = 5;
    // Minimum amount of mana allowed
    private static final int MIN_MANA = 0;
    // Maximum amount of mana allowed
    private static final int MAX_MANA = 50;

    // Amount of mana of the Elf
    private int mana;

    /**
     * Creates a valid Elf Creature with a name, date of birth, health, and
     * mana.
     *
     * @param name The name of the Elf.
     * @param dateOfBirth The date of birth of the Elf.
     * @param health The health of the Elf.
     * @param mana The amount of initial mana of the Elf.
     * @throws IllegalArgumentException If the mana is negative or greater than
     *                                  the maximum mana allowed.
     */
    public Elf(final String name,
               final Date dateOfBirth,
               final int health,
               final int mana)
        throws IllegalArgumentException
    {
        super(name, dateOfBirth, health);
        if (mana < MIN_MANA || mana > MAX_MANA)
        {
            throw new IllegalArgumentException("Mana must be between 0 and 50");
        }
        else this.mana = mana;
    }

    /**
     * The spell that is cast and causes damage.
     *
     * @return The amount of damage caused by the spell.
     * @throws LowManaException If the mana of the Elf is less than 5.
     */
    public int castSpell()
        throws LowManaException
    {
        if (mana < MANA_THRESHOLD)
        {
            throw new LowManaException("Mana must be at least 5");
        }
        else
        {
            mana -= MANA_THRESHOLD;
        }
        return SPELL_DAMAGE;
    }

    /**
     * Prints the details of the Elf.
     */
    @Override
    public void getDetails()
    {
        super.getDetails();
        System.out.println("\nMana: " + mana);
    }

    /**
     * Exception thrown when the Elf's mana is too low to cast a spell.
     */
    public static class LowManaException extends Exception
    {
        public LowManaException(final String message)
        {
            super(message);
        }
    }
}
