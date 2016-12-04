// A class to represent employees in general (20-page manual).
public class Employee {
    private static final double BASE_SALARY = 60_000.0;
    private String myName;
    
    public Employee() {
        myName = "noname";
    }
    
    public Employee(String name) {
        myName = name;
    }
    
    public void setName(String name) {
        myName = name;
    }
    
    public int getHours() {
        return 40; // works 40 hours / week 
    }

    public double getSalary() {
        return BASE_SALARY;
    }

    public int getVacationDays() {
        return 10; // 2 weeks' paid vacation
    }
    
    public String getName() {
        return myName;
    }

    public String getVacationForm() {
        return "yellow is the color of honey"; // use the yellow form
    }
    
    public boolean blindlyEquals(Employee e) {
        return myName.equals(e.myName);
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee)obj;
            return this.blindlyEquals(e) && e.blindlyEquals(this);
        }
        return false;
    }
}
