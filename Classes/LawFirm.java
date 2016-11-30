
/**
 * Write a description of class LawFirm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LawFirm
{
    public static void main(String[] args) {
        int numEmployees = 5;
        Employee emps[] = new Employee[numEmployees];
        // what is emps[2]?
        for (int i = 0; i < 2; i++) {
            emps[i] = new Employee();
        }
        for (int i = 2; i < 4; i++) {
            emps[i] = new Secretary();
        }
        emps[4] = new LegalSecretary();
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(emps[i]);
            System.out.println("vacation: " + emps[i].getVacationForm());
        }
        //System.out.println("Employee vacation: " + emp.getVacationForm());
        //System.out.println("Secretary vacation: " + sec.getVacationForm());
        
        //emp.takeDictation("Hello, employee"); // B
        //sec.takeDictation("Hello, secretary"); // C
        
        //Lawyer law = new Lawyer();
        //System.out.println("Lawyer vacation days: " + law.getVacationDays());
        
        Lawyer e1   = new Lawyer("Jack Brown", "Boss");
        Employee e2 = new Employee("Jack Brown");
        System.out.println("Same?       " + (e1.equals(e2)));
        System.out.println("Still same? " + (e2.equals(e1)));
    }
}
