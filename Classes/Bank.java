
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
        BankAccount drumpf = new BankAccount("Drumpf", EXECUTIVE, 10_000_000, 0.03);
        BankAccount nate_dogg = new BankAccount("Nathan Clement", STUDENT, 36.60, 0.01);
        BankAccount nat_pro = new BankAccount("Nate Cleme", STUDENT, 500, 0.03);
        BankAccount deptChair = new BankAccount("Bruce Porter", TRADITIONAL, 247_498, 0.02);
        
        // Trump got $100,000 for winning the election
        drumpf.deposit(100_000);
        // I got a $50 raise (per semester) for teaching this class
        nate_dogg.deposit(50);
        // I tried to pull out $10M
        nate_dogg.widthdraw(10_000_000);
        System.out.println("Nate Dogg should have $86.60: " + nate_dogg.getCurrentAmount());
       
        // I want to merge my "slush" account with my regular so I can buy groceries.
        nate_dogg.merge(nd_pro);
        System.out.println("Nate Dogg should have $586.60: " + nate_dogg.getCurrentAmount());
        System.out.println("Nate Dogg's slush account should have $0.00: " + nat_pro.getCurrentAmount());
    }
}
