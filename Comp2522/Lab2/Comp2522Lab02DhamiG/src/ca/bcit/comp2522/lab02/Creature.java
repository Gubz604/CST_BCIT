package ca.bcit.comp2522.lab02;

/**
 * Represents the superclass for a Creature. The Parent class has a name, date
 * of birth, and health. A Creature can check if it is alive, it can take
 * damage, and heal. There is a method to retrieve the Creature's age in years
 * as well as print out its details.
 *
 * <p>This class provides a valid Creature.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-30
 */
public class Creature
{
    // Name of the Creature
    private final String name;
    // Date of Birth of the Creature
    private final Date dateOfBirth;
    // Health of the Creature
    private int health;

    /**
     * Creates a Creature with a name, date of birth, and health.
     *
     * @param name The name of the Creature.
     * @param dateOfBirth The date of birth of the Creature.
     * @param health The health of the Creature.
     * @throws IllegalArgumentException If the date of birth is younger than
     *                                  1800 or older than 2025.
     */
    public Creature(final String name,
                    final Date dateOfBirth,
                    final int health)
        throws IllegalArgumentException
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.health = health;
    }

    /**
     * Returns if the Creature's health is greater than 0.
     *
     * @return True if the Creature's health is greater than 0.
     */
    public boolean isAlive()
    {
        return health > 0;
    }

    /**
     * Causes the health of the Creature to go down.
     *
     * @param damage The amount of health decreased.
     */
    public void takeDamage(final int damage)
    {
        if (health - damage < 0) health = 0;
        else if (damage < 0)
        {
            throw new DamageException("Damage cannot be negative");
        }
        else health -= damage;
    }

    /**
     * Causes the health of the Creature to go up.
     *
     * @param heal The amount of health increased.
     */
    public void heal(final int heal)
    {
        if (health + heal > 100) health = 100;
        else if (heal < 0)
        {
            throw new HealingException("Heal cannot be negative");
        }
        else health += heal;
    }

    /**
     * Returns the age of the Creature in years.
     *
     * @return The age of the Creature in years.
     */
    public int getAgeYears()
    {
        return Date.CURRENT_YEAR - dateOfBirth.getYear();
    }

    /**
     * Prints the details of the Creature.
     */
    public void getDetails()
    {
        System.out.println(name + " " + dateOfBirth + " " + health);
    }
}

// Runtime Exception for invalid damage amount
class DamageException
    extends RuntimeException
{
    public DamageException(String message)
    {
        super(message);
    }
}

// Runtime Exception for invalid healing amount
class HealingException extends RuntimeException
{
    public HealingException(String message)
    {
        super(message);
    }
}
