package ca.bcit.comp2522.lab04;

/**
 * Represents a Biography subclass that inherits from the Book class. The
 * Biography class implements Printable. A Book has a title, year published, an
 * author, and additionally a Subject.
 *
 * <p>This class produces a valid Biography.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-07-01
 */
public class Biography
    extends Book
    implements Printable
{
    // The Person the Biography is about
    private final Person subject;

    /**
     * Creates a Biography that has a title, year published, author and subject.
     *
     * @param title The title of the Biography.
     * @param yearPublished The year the Biography was published.
     * @param author The author of the Biography.
     * @param subject The subject of the Biography.
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);
        if (subject == null)
        {
            throw new NullPointerException("Subject is null");
        }
        this.subject = subject;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * <p>Two Biographies are the same if they are of the same class and if the
     * the subject of the Biographies are the same.</p>
     *
     * @param obj the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument;
     *         {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (obj == null)
        {
            return false;
        } // this is definitely not equal to null
        if (!(obj.getClass().equals(this.getClass())))
        {
            return false;
        } // these aren't the same class
        final Biography other = (Biography) obj;
        return this.subject.compareTo(other.subject) == 0;
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
        return subject.hashCode();
    }

    /**
     * Prints every instance variable (including those in parent classes) in a
     * sentence.
     */
    @Override
    public void display()
    {
        super.display();
        System.out.println("\nBiography of: " + subject);
    }
}
