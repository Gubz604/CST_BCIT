package ca.bcit.comp2522.lab01;

/**
 * Represents an individual's Bank Account. The Bank Account includes a Bank
 * Client, an account number, a date when the account was opened, a date when
 * the account was closed, and the starting balance when the account was
 * created.
 *
 * <p>This class provides a valid Bank Account.</p>
 */
public class BankAccount
{
    private final BankClient bc;
    private final int accountNumber;
    private final Date accountOpened;
    private Date accountClosed;
    private double balanceCad;

    /**
     * Creates a Bank Account with an account number, account opened date,
     * Bank Client, and initial balance.
     *
     * @param accountNumber The account number.
     * @param accountOpened The date when the account was opened.
     * @param bc The Bank Client.
     * @param balanceCad The initial balance.
     */
    public BankAccount(final int accountNumber,
                       final Date accountOpened,
                       final BankClient bc,
                       double balanceCad)
    {
        this.accountNumber = accountNumber;
        this.accountOpened = accountOpened;
        this.bc = bc;
        this.balanceCad = balanceCad;
        this.accountClosed = null;
    }

    /**
     * Creates a Bank Account with an account number, account opened date,
     * Bank Client, and initial balance.
     *
     * @param accountNumber The account number.
     * @param accountOpened The date when the account was opened.
     * @param bc The Bank Client.
     * @param balanceCad The initial balance.
     * @param accountClosed The date when the account was closed.
     */
    public BankAccount(final int accountNumber,
                       final Date accountOpened,
                       final BankClient bc,
                       double balanceCad,
                       Date accountClosed)
    {
        this(accountNumber, accountOpened, bc, balanceCad);
        this.accountClosed = accountClosed;
    }

    /**
     * Returns the amount left in the account after a withdrawl.
     *
     * @param amountCAD Amount being withdrawn from account.
     * @return The amount leftover after withdrawl.
     */
    public double withdraw(final double amountCAD)
    {
        return balanceCad - amountCAD;
    }

    /**
     * Returns a string of the Bank Account's details.
     *
     * @return A string of the Bank Account's details.
     */
    public String getDetails()
    {
        return "Value left in bank account is $" + balanceCad;
    }
}
