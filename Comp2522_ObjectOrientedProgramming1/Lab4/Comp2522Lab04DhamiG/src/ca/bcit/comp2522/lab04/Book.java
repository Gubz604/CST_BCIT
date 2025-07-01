package ca.bcit.comp2522.lab04;

/**
 * Represents a Book object that has a title, year published, and an author.
 * This class implements Comparable such that older books are "larger." As well,
 * The Book class implements Printable and Reversible.
 *
 * <p>This class produces a valid Book.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-07-01
 */
public class Book
    implements Comparable<Book>, Printable, Reversible
{
    // Maximum length the title can be
    private static final int MAX_TITLE_LENGTH = 100;
    // Minimum year a book can be published
    private static final int MIN_YEAR_PUBLISHED = 1;
    // Maximum year a book can be published
    private static final int MAX_YEAR_PUBLISHED = 2025;

    // Title of the book
    private final String title;
    // Year the book was published
    private final int yearPublished;
    // The Author of the book
    private final Author author;

    /**
     * Creates a Book with a title, year published, and author.
     *
     * @param title The title of the book.
     * @param yearPublished The year the book was published.
     * @param author The author of the book
     * @throws IllegalArgumentException If the title is null, blank, or the
     *                                  length is greater than the max title
     *                                  length.
     */
    public Book(final String title,
                final int yearPublished,
                final Author author)
        throws IllegalArgumentException
    {
        if (title == null || title.isBlank() ||
            title.length() > MAX_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid title");
        }
        if (yearPublished < MIN_YEAR_PUBLISHED ||
            yearPublished > MAX_YEAR_PUBLISHED)
        {
            throw new IllegalArgumentException("Invalid year");
        }
        if (author == null)
        {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    /**
     * Prints every instance variable (including those in parent classes) in a
     * sentence.
     */
    @Override
    public void display()
    {
        System.out.println("Title: " + title + "\nYear Published: " +
                               yearPublished + "\nAuthor: " + author);
    }

    /**
     * Prints the name/title backward.
     */
    @Override
    public void backward()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = title.length() - 1; i >= 0; i--)
        {
            builder.append(title.charAt(i));
        }
        System.out.println(builder);
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
    public int compareTo(Book o)
    {
        return o.yearPublished - this.yearPublished;
    }
}
