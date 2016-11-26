
/**
 * Write a description of class Lawyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lawyer extends Employee
{
    public int getVacationDays() {
        return 15; // 3 weeks' paid vacation
    }
    
    public double getSalary() {
        // Can't say super.BASE_SALARY + 10_000 because BASE_SALARY is private
        return super.getSalary() + 10_000; // gets 10k more than employee
    }
}
