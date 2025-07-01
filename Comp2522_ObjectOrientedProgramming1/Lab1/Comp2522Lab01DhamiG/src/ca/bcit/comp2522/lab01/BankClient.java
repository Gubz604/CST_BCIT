package ca.bcit.comp2522.lab01;

/**
 * Represent's a client of a bank. The Bank Client has a signup date as well as
 * a client ID.
 *
 * <p>This class provides a valid Bank Client.</p>
 */
public class BankClient extends Person
{
    private final Date signupDate;
    private final String clientID;

    /**
     * Creates a valid Bank Client with a Name, birthdate, signup date,
     * and client ID.
     *
     * @param name Name of the client.
     * @param birthDate The birthdate of the client.
     * @param signupDate The signup date of the client.
     * @param clientID The client's clientID.
     * @throws IllegalArgumentException If the client ID is not 6 or 7 digits in
     *                                  length.
     */
    public BankClient(final Name name,
                      final Date birthDate,
                      final Date signupDate,
                      final String clientID)
        throws IllegalArgumentException
    {
        super(name, birthDate);
        if (clientID.length() == 6 || clientID.length() == 7)
        {
            this.clientID = clientID;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Client ID");
        }
        this.signupDate = signupDate;

    }

    /**
     * Creates a valid Bank Client with a Name, birthdate, signup date,
     * and client ID.
     *
     * @param name Name of the client.
     * @param birthDate The birthdate of the client.
     * @param deathDate The deathdate of the client.
     * @param signupDate The signup date of the client.
     * @param clientID The client's clientID.
     */
    public BankClient(final Name name,
                      final Date birthDate,
                      final Date deathDate,
                      final Date signupDate,
                      final String clientID)
    {
        super (name, birthDate, deathDate);
        this.signupDate = signupDate;
        if (clientID.length() == 6 || clientID.length() == 7)
        {
            this.clientID = clientID;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Client ID");
        }
    }


    /**
     * Returns a string of the client's details.
     *
     * @return A string of the client's details.
     */
    @Override
    public String getDetails()
    {
        final String aliveStatus;
        if (getDeathDate() == null) aliveStatus = "(alive)";
        else aliveStatus = "(died " + getDeathDate() + ")";

        return getName() + " " + aliveStatus + " was born on " +
            getBirthDate() + "!";
    }
}
