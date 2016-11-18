
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    // Needs: name, balance, interest rate, unique ID, account type
    private String myName;
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
    }
}
