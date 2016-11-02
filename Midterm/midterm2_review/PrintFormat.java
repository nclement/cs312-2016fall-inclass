import java.util.*;

public class PrintFormat {
    public static void main(String[] args) {
        System.out.printf("This is a int %d\n", 123);
        System.out.printf("This is a string %s\n", "foobat");
        System.out.printf("This is a float %.5f\n", 1.0 / 3.0);
        System.out.printf("This is a padded string %20s\n", "brady");
        System.out.printf("First: %s Second: %s", "foo", "bar");
    }
}
