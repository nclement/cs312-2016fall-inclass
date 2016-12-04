
/**
 * Write a description of class Lawyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lawyer extends Employee
{
    private String myTitle;

    public Lawyer(String name, String title) {
        super(name);
        myTitle = title;
    }

    public int getVacationDays() {
        return 15; // 3 weeks' paid vacation
    }

    public double getSalary() {
        // Can't say super.BASE_SALARY + 10_000 because BASE_SALARY is private
        return super.getSalary() + 10_000; // gets 10k more than employee
    }

    public boolean blindlyEquals(Employee o) {
        if (o instanceof Lawyer) {
            // Cast o to be a Lawyer
            Lawyer l = (Lawyer)o;
            return super.equals(o) && myTitle.equals(l.myTitle);
        }
        
        return false;
    }

    public boolean equals(Lawyer obj) {
        if (obj instanceof Lawyer) {
            Lawyer e = (Lawyer)obj;
            if (getName().equals(e.getName()) && myTitle.equals(e.myTitle)) {
                return true;
            }
        }
        return false;
    }
}