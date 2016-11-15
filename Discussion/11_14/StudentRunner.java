public class StudentRunner {
    public static void main(String[] args) {
        Student brady = new Student("Brady");

        brady.takeAClass('A');
        brady.takeAClass('B');

        System.out.println(brady.getGPA());

        Student andy = new Student("Andy");

        andy.takeAClass('C');
        andy.takeAClass('C');
        andy.takeAClass('C');
        andy.takeAClass('C');

        System.out.println(andy.getGPA());

        System.out.println(Student.school);

        // Compile error, totalStudents is private.
        /* System.out.println(Student.totalStudents); */
        /* Student.totalStudents = 0; */

        Student georgina = new Student("georgina");
    }
}
