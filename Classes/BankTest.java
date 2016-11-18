
/**
 * Write a description of class BankTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankTest
{
    public static void main(String[] args) {
        AccountType t = AccountType.EXECUTIVE;
        if (t == AccountType.STUDENT) {
            System.out.println("It's a student!");
        } else {
            System.out.println("Nope");
        }
    }
}
