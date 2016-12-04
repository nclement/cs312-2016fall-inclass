
/**
 * Write a description of class Bank here.
 * 
 * Go to goo.gl/vH9Rii to see the website.
 * 
 * @author Nathan Clement
 */
public class Bank
{
    public static void main(String[] args) {
        BankAccount newThing = new BankAccount();
        
        
        BankAccount drumpf = new BankAccount("Drumpf", 10_000_000, 0.03, BankAccount.AccountType.EXECUTIVE);
        BankAccount nate_dogg = new BankAccount("Nathan Clement", 36.60, 0.01, BankAccount.AccountType.STUDENT);
        BankAccount nat_pro = new BankAccount("Nate Cleme", 500, 0.03, BankAccount.AccountType.STUDENT);
        BankAccount deptChair = new BankAccount("Bruce Porter", 247_498, 0.02, BankAccount.AccountType.TRADITIONAL);

        // Trump got $100,000 for winning the election
        drumpf.deposit(100_000);
        // I got a $50 raise (per semester) for teaching this class
        nate_dogg.deposit(50);
        
        try {
            // I tried to pull out $10M -- expecting this to fail.
            nate_dogg.withdraw(10_000_000);
            System.out.println("ERROR: Tried to withdraw too much!!");
        }
        catch(IllegalStateException e) {
            System.out.println("Success!! We failed with message: " + e.getMessage());
        }
        
        
        System.out.println("Nate Dogg should have $86.60: " + nate_dogg.getCurrentAmount());

        // I want to merge my "slush" account with my regular so I can buy groceries.
        nate_dogg.merge(nat_pro);
        System.out.println("Nate Dogg should have $586.60: " + nate_dogg.getCurrentAmount());
        System.out.println("Nate Dogg's slush account should have $0.00: " + nat_pro.getCurrentAmount());
    }
}
