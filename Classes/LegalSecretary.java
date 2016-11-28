
/**
 * Write a description of class LegalSecretary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LegalSecretary extends Secretary
{
    public double getSalary() {
        return super.getSalary() + 20_000; // gets 20k more than employee
    }
   
    public String toString() {
        return "LegalSecretaries are hard to spell!";
    }
}
