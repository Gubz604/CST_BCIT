package ca.bcit.comp2522.lab04;

/**
 * Represents an Author subclass that extends the Person class. An Author will
 * have a name, birthdate, as well as additionally a genre.
 *
 * <p>This class produces a valid Author.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-07-01
 */
public class Author
    extends Person
    implements Printable
{
    // Maximum number of characters the Genre can be
    private static final int MAX_GENRE_CHARS = 30;

    // Genre of the Author
    private final String genre;

    /**
     * Creates an Author that has a name, birthdate, and genre.
     *
     * @param name The name of the Author.
     * @param birthDate The birthdate of the Author.
     * @param genre The genre the Author writes in.
     * @throws IllegalArgumentException If the genre is null, blank or the
     *                                  length of the genre is more than the max
     *                                  allowed.
     */
    public Author(final Name name,
                  final Date birthDate,
                  final String genre)
        throws IllegalArgumentException
    {
        super(name, birthDate);
        if (genre == null || genre.isBlank() ||
            genre.length() > MAX_GENRE_CHARS)
        {
            throw new IllegalArgumentException("Invalid Genre");
        }
        this.genre = genre;
    }

    /**
     * Prints every instance variable (including those in parent classes) in a
     * sentence.
     */
    @Override
    public void display()
    {
        super.display();
        System.out.println("\nGenre: " + genre);
    }
}
