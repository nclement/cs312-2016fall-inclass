public class EmptyRunner {
    public static void main(String[] args) {
        // Why can I call these? I didn't define any constructors.
        Empty e = new Empty();
        Empty f = new Empty();
        Empty g = e;

        // How can I use these methods? I didn't write any in the class.
        // false
        System.out.println(e.equals(f));

        // true
        System.out.println(e.equals(g));

        // same things
        System.out.println(e);
        System.out.println(e.toString());
    }
}
