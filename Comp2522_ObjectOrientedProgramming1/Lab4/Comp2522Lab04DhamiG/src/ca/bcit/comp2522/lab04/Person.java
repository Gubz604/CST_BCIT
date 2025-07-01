package ca.bcit.comp2522.lab04;

/**
 * Represents a Person with a Name, Birthdate, and Deathdate (if the individual
 * has passed away).
 *
 * <p>This class provides a valid Person.</p>
 */
public class Person
    implements Comparable<Person>, Printable, Reversible
{
    private final Name name;
    private final Date birthDate;
    private Date deathDate;

    /**
     * Creates a Person with a Name and birthdate.
     *
     * @param name      The name of the Person.
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
     * @param name      The name of the Person.
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
        if (deathDate == null)
        {
            aliveStatus = "(alive)";
        }
        else
        {
            aliveStatus = "(died " + deathDate + ")";
        }

        return name + " " + aliveStatus + " was born on " + birthDate + "!";
    }

    /**
     * Prints every instance variable (including those in parent classes) in a
     * sentence.
     */
    @Override
    public void display()
    {
        boolean isAlive;
        isAlive = deathDate == null;

        if (isAlive)
        {
            System.out.println("Name: " + name + "\nBirthdate: " + birthDate);
        }
        else
        {
            System.out.println("Name: " + name + "\nBirthdate: " + birthDate +
                                   "\nDeathdate: " + deathDate);
        }
    }

    /**
     * Prints the name/title backward.
     */
    @Override
    public void backward()
    {
        System.out.println(name.getReverseName());
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */
    @Override
    public int compareTo(Person o)
    {
        if (this.birthDate.getYear() == o.birthDate.getYear())
        {
            if (this.birthDate.getMonth() == o.birthDate.getMonth())
            {
                if (this.birthDate.getDay() == o.birthDate.getDay()) return 0;
                else return o.birthDate.getDay() - this.birthDate.getDay();
            }
            else return o.birthDate.getMonth() - this.birthDate.getMonth();
        }
        else return o.birthDate.getYear() - this.birthDate.getYear();
    }

    @Override
    public String toString()
    {
        return name.getFirst() + " " + name.getLast();
    }
}

