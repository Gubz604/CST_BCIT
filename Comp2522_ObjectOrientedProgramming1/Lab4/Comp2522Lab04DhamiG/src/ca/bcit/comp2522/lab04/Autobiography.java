package ca.bcit.comp2522.lab04;

/**
 * Represents an Autobiography subclass that inherits from Biography. The
 * subject of the Autobiography is automatically set to the author.
 *
 * <p>This class produces a valid Autobiography.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-07-01
 */
public class Autobiography
    extends Biography
    implements Printable
{
    /**
     * Creates an Autobiography with a title, year published, and an author. The
     * author is automatically set to the subject in the parent class
     * constructor.
     *
     * @param title The title of the Autobiography.
     * @param yearPublished The year the Autobiography was published.
     * @param author The author of the Autobiography.
     */
    public Autobiography (final String title,
                          final int yearPublished,
                          final Author author)
    {
        super(title, yearPublished, author, author);
    }

    /**
     * Prints every instance variable (including those in parent classes) in a
     * sentence.
     */
    @Override
    public void display()
    {
        super.display();
        System.out.println("\nAll the instance variables are already printed " +
                               "so I'm just printing this for no reason!");
    }
}
