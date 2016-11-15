public class Student {
    // class variable (static)
    final static String school = "UT";
    private static int totalStudents = 0;

    // instance variables (nonstatic, bound to an instance)
    private String name;
    public int classesTaken;
    public int totalCreditPoints;
    public int UTEID;

    public Student(String name) {
        this.name = name;
        this.classesTaken = 0;
        this.totalCreditPoints = 0;

        totalStudents++;
        this.UTEID = totalStudents;

        System.out.println("Creating a new student: " + name);
        System.out.println("ID: " + this.UTEID);
    }

    public void takeAClass(char letterGrade) {
        System.out.println(this.name + " took a class");

        if (letterGrade == 'A')
            this.totalCreditPoints += 4;
        else if (letterGrade == 'B')
            this.totalCreditPoints += 3;
        else if (letterGrade == 'C')
            this.totalCreditPoints += 2;
        else if (letterGrade == 'F')
            this.totalCreditPoints += 0;

        this.classesTaken++;
    }

    public double getGPA() {
        return (1.0 * this.totalCreditPoints / this.classesTaken);
    }
}
