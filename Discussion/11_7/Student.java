public class Student {
    String name;
    int classesTaken;
    int totalCreditPoints;

    public Student(String name) {
        System.out.println("Creating a new student: " + name);

        this.name = name;
        this.classesTaken = 0;
        this.totalCreditPoints = 0;
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

    public String getSchoolName() {
        return "UT Austin";
    }

    public String toString() {
        return "Name: " + this.name;
    }
}
