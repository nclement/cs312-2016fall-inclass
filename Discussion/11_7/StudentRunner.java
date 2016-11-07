public class StudentRunner {
    public static void main(String[] args) {
        Student brady = new Student("Brady");
        Student weipo = new Student("Wei po");

        brady.takeAClass('A');
        brady.takeAClass('F');

        weipo.takeAClass('A');
        weipo.takeAClass('A');
        weipo.takeAClass('A');
        weipo.takeAClass('A');

        System.out.println(brady.getGPA());
        System.out.println(weipo.getGPA());

        System.out.println(Student.getSchoolName());
    }
}
