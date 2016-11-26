
/**
 * Write a description of class LegalSecretary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LegalSecretary extends Lawyer
{
    public double getSalary() {
        return super.getSalary() + 20_000; // gets 20k more than employee
    }
}
