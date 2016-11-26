
/**
 * Write a description of class LawFirm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LawFirm
{
    public static void main(String[] args) {
        Employee emp = new Employee();
        Secretary sec = new Secretary();
        
        System.out.println("Employee vacation: " + emp.getVacationForm());
        System.out.println("Secretary vacation: " + sec.getVacationForm());
        
        //emp.takeDictation("Hello, employee"); // B
        sec.takeDictation("Hello, secretary"); // C
        
        Lawyer law = new Lawyer();
        System.out.println("Lawyer vacation days: " + law.getVacationDays());
    }
}
