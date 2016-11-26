// A class to represent employees in general (20-page manual).
public class Employee {
    private static final double BASE_SALARY = 60_000.0;
    
    public int getHours() {
        return 40; // works 40 hours / week 
    }

    public double getSalary() {
        return BASE_SALARY;
    }

    public int getVacationDays() {
        return 10; // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow is the color of honey"; // use the yellow form
    } 
}