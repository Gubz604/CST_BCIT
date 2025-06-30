package ca.bcit.comp2522.lab01;

/**
 * Represents a Person with a Name, Birthdate, and Deathdate (if the individual
 * has passed away).
 *
 * <p>This class provides a valid Person.</p>
 */
public class Person
{
    private final Name name;
    private final Date birthDate;
    private Date deathDate;

    /**
     * Creates a Person with a Name and birthdate.
     *
     * @param name The name of the Person.
     * @param birthDate The Person's birthdate.
     */
    public Person(final Name name,
                  final Date birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = null;
    }

    /**
     * Creates a Person with a Name, birthdate, and deathdate. This person has
     * passed away.
     *
     * @param name The name of the Person.
     * @param birthDate The Person's birthdate.
     * @param deathDate The Person's deathdate.
     */
    public Person(final Name name,
                  final Date birthDate,
                  final Date deathDate)
    {
        this(name, birthDate);
        this.deathDate = deathDate;
    }

    /**
     * Returns the Person's Name.
     *
     * @return The Person's Name.
     */
    public Name getName()
    {
        return name;
    }

    /**
     * Returns the Person's birthdate.
     *
     * @return The Person's birthdate.
     */
    public Date getBirthDate()
    {
        return birthDate;
    }

    /**
     * Returns the Person's deathdate.
     *
     * @return The Person's deathdate.
     */
    public Date getDeathDate()
    {
        return deathDate;
    }

    /**
     * Returns a string of the Person's details.
     *
     * @return A string with the Person's details.
     */
    public String getDetails()
    {
        final String aliveStatus;
        if (deathDate == null) aliveStatus = "(alive)";
        else aliveStatus = "(died " + deathDate + ")";

        return name + " " + aliveStatus + " was born on " + birthDate + "!";
    }
}
