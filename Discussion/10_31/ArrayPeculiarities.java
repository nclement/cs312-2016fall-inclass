import java.util.*;
import java.io.*;

public class ArrayPeculiarities {
    public static void main(String[] args) throws IOException {
        // Short circuit logic, these don't throw anything!
        System.out.println("Short circuit demo.");
        int[] arr = {1, 2, 3};
        System.out.println(1 > 0 || arr[100] == 1);
        System.out.println(0 > 1 && arr[100] == 1);

        // We can make an array of anythings.
        System.out.println("Arbitrary array demo.");
        Scanner[] scannerArray = new Scanner[3];
        scannerArray[0] = new Scanner(System.in);
        scannerArray[1] = new Scanner(new File("notes"));

        // == compares MEMORY addresses. Only the first is true.
        System.out.println(scannerArray[0] == scannerArray[0]);
        System.out.println(scannerArray[0] == scannerArray[1]);
        System.out.println(scannerArray[0] == scannerArray[2]);

        // This is real equality, but one is reading from System.in, the other, a file.
        System.out.println(scannerArray[0].equals(scannerArray[1]));

        // Can't do these, arr[1] is null, we'd get a runtime error.
        /* System.out.println(scannerArray[2].equals(scannerArray[1])); */
        /* System.out.println(scannerArray[1].equals(scannerArray[2])); */

        // Array and equals.
        System.out.println("More array comparisons");
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 2};
        b[2] = 3;

        System.out.println("a's elements: " + Arrays.toString(a));
        System.out.println("b's elements: " + Arrays.toString(b));

        // Comparing memory addresses again, false, since they are different.
        System.out.println("a == b: " + (a == b));

        // Now c is a memory address looking at the same place as b. NOT a copy.
        int[] c = b;
        System.out.println("c == b: " + (c == b));

        // Real equality. Both of these are true.
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(b, c));

        // You can look at memory addresses if you want.
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
