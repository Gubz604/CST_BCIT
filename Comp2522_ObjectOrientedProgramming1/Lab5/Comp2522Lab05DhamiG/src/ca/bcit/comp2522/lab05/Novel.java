package ca.bcit.comp2522.lab05;

/**
 * Represents A Novel that has a title, author, and a year published.
 *
 * <p>This class produces a valid Novel</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-07-01
 */
public class Novel
    implements Comparable<Novel>
{
    // The title of the Novel
    private final String title;
    // The Name of the author
    private final String author;
    // The year the Novel was published
    private final int yearPublished;

    /**
     * Creates a Novel with a title, an author, and a year published.
     *
     * @param title         The title of the Novel.
     * @param author        The author of the Novel.
     * @param yearPublished The year the Novel was published.
     */
    public Novel(final String title,
                 final String author,
                 final int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the Novel.
     *
     * @return The title of the Novel.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the name of the author.
     *
     * @return The name of the author.
     */
    public String getAuthorName()
    {
        return author;
    }

    /**
     * Returns the year the Novel was published.
     *
     * @return The year the Novel was published.
     */
    public int getYearPublished()
    {
        return yearPublished;
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
    public int compareTo(Novel o)
    {
        return this.title.compareToIgnoreCase(o.title);
    }
}