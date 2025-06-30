package ca.bcit.comp2522.lab01;

/**
 * Represents a name with operations to reverse the name and to retrieve the
 * individual's initials.
 *
 * <p>This class provides a simple name with a first and last name.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-28
 */
public class Name
{

    /** Max length for first or last name */
    public static final int NAME_LENGTH = 45;

    private final String first;
    private final String last;

    /**
     * Creates a name with a first and last name.
     *
     * @param first The individual's first name.
     * @param last The individual's last name.
     * @throws IllegalArgumentException if either name is empty, blank, longer
     *                                  than 45 characters or contains the
     *                                  string "admin."
     */
    public Name(final String first,
                final String last)
        throws IllegalArgumentException
    {
        if (first.isEmpty() || first.isBlank() ||
            first.length() > NAME_LENGTH ||
            first.toLowerCase().contains("admin"))
        {
            throw new IllegalArgumentException("Invalid first name");
        }
        if (last.isEmpty() || last.isBlank() || last.length() > NAME_LENGTH ||
            last.toLowerCase().contains("admin"))
        {
            throw new IllegalArgumentException("Invalid last name");
        }

        this.first = first;
        this.last = last;
    }

    /**
     * Returns the first name.
     *
     * @return the first name.
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Returns the last name.
     *
     * @return the last name.
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Produces the initials in upper case.
     *
     * @return the Name's initials in upper case.
     */
    public String getInitials()
    {
        return first.substring(0, 1).toUpperCase() + "." +
            last.substring(0, 1).toUpperCase() + ".";
    }

    /**
     * Reverses the Name to produce last name first with reversed strings.
     *
     * @return A string that is now last name-first and first name-last  with
     *         both strings reversed.
     */
    public String getReverseName()
    {
        StringBuilder builder = new StringBuilder();

        for (int i = first.length() - 1; i >= 0; i--)
        {
            builder.append(first.charAt(i));
        }
        builder.append(" ");
        for (int i = last.length() - 1; i >= 0; i--)
        {
            builder.append(last.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String toString()
    {
        return first + " " + last;
    }
}
