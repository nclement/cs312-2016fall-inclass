
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
            emps[i].takeDictation("Hello, secretary");
        }
        //System.out.println("Employee vacation: " + emp.getVacationForm());
        //System.out.println("Secretary vacation: " + sec.getVacationForm());
        
        //emp.takeDictation("Hello, employee"); // B
        //sec.takeDictation("Hello, secretary"); // C
        
        //Lawyer law = new Lawyer();
        //System.out.println("Lawyer vacation days: " + law.getVacationDays());
    }
}
