
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    public enum AccountType
    {
        EXECUTIVE, TRADITIONAL, STUDENT
    }

    // Needs: name, balance, interest rate, unique ID, account type
    private String myName;
    // I want to make sure this balance is *always* positive
    private double myBalance;
    private double myInterestRate;
    private int myUID;
    private AccountType myType;

    private static int globalUID = 0;

    // Create a constructor
    public BankAccount(String name, double balance, double ir, AccountType type) {
        // Look at the local copy of myName (passed in the constructor) and assign 
        // it the value of the local copy of myName (passed in the constructor)
        myName = name;
        myBalance = balance;
        myInterestRate = ir;
        myType = type;

        myUID = globalUID;
        globalUID++;
    }

    /**
     * Merges two accounts
     * 
     * Two accounts (a "primary" and a "secondary") can be "merged" in the following fashion:
     * 
     * - Accounts can only be merged if they are both of the same type. 
     *   Otherwise this function will return false.
     * - The name of the primary account (and unique ID) does not change 
     *   (must keep the owner)
     * - The interest rate of both accounts will be the lowest of the primary 
     *   and secondary accounts after the merger
     * - The balance of the "secondary" account must be zero after the end of the merge
     */
    public boolean merge(BankAccount secondary) {
        if (this.myType != secondary.myType) {
            return false;
        }

        // Set both interest rates to the lowest
        if (this.myInterestRate > secondary.myInterestRate) {
            // Updated mine because it's highest.
            this.myInterestRate = secondary.myInterestRate;
        } else {
            secondary.myInterestRate = this.myInterestRate;            
        }

        // Update the balance
        this.myBalance += secondary.myBalance;
        // Set the balance in the secondary account to zero.
        secondary.myBalance = 0;

        return true;
    }

    public double getCurrentAmount() {
        return myBalance;
    }

    /**
     * Deposits the given amount into the bank account.
     */
    public void deposit(double amount) {
        myBalance += amount;
    }

    /**
     * Withdraw the specified amount; returns the new amount.
     * 
     * If there's not enough money in the account, throw an 
     * IllegalStateException
     */
    public double withdraw(double amount) {
        if (myBalance < amount) {
            throw new IllegalStateException("Account balance too small!");
        }
        
        myBalance -= amount;
        return myBalance;
    }

}
