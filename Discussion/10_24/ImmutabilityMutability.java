import java.io.*;
import java.util.*;

public class ImmutabilityMutability {
    public static void main(String[] args) {
        // Messing with primitives.. (int, char, long, float).
        int num = 1;
        System.out.println("Before: " + num);
        touchPrimitive(num);
        System.out.println("After: " + num);
        System.out.println();

        // Strings.
        String word = "foo";
        System.out.println("Before: " + word);
        touchString(word);
        System.out.println("After: " + word);
        System.out.println();

        // Arrays.
        char[] charArray = {'f', 'o', 'o'};
        System.out.println("Before: " + Arrays.toString(charArray));
        touchCharArray(charArray);
        System.out.println("After: " + Arrays.toString(charArray));
        System.out.println();

        // Arrays.
        int[] intArray = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(intArray));
        touchArray(intArray);
        System.out.println("After: " + Arrays.toString(intArray));
        System.out.println();

        System.out.println(intArray);
    }

    public static void touchPrimitive(int number) {
        number = 10101;
        System.out.println("During: " + number);
    }

    public static void touchString(String word) {
        word = "bar";
        System.out.println("During: " + word);
    }

    public static void touchCharArray(char[] array) {
        array[0] = 'g';
        System.out.println("First modification: " + Arrays.toString(array));

        array = new char[] {'b', 'a', 'r'};
        System.out.println("Second modification: " + Arrays.toString(array));
    }

    public static void touchArray(int[] array) {
        array[0] = 1000;
        System.out.println("First modification: " + Arrays.toString(array));
    }
}
