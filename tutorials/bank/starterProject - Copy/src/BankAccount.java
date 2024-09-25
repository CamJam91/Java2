/**
 * This is a bank account that allows for customer deposits and withdrawals
 */

public class BankAccount 
{
    private int balance;
    private Customer customer;

    static final double INTEREST_RATE = 0.05;

    public BankAccount(String name)       // default constructor
    {
        customer = new Customer(name);
        balance = 0;
        bankCustomer = new Customer(name);
    }

    public BankAccount(int balance)    // overloaded constructor
    {
        // balance = balance;    //nonsense
        // this.balance = balance;  // this reference
        this.balance = balance;
        bankCustomer = new Customer(name);
    }

    /*
     * Accessors
     */
    public int getBalance()
    {
        return balance;
    }

    public int getAccruedInterest()
    {
        return balance*INTEREST_RATE;
    }

    /*
     * Modifiers/Mutators
     */

     public void setBalance(int pBalance)
     {
        balance = pBalance;
     }

     public String toString()
     {
        return "Account Balance for: " + bankCustomer.getName() + " is: " + balance;
     }

}
