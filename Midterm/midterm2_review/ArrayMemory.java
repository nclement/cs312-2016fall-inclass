import java.util.*;

public class ArrayMemory {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // memory address - 1234.
        System.out.println(arr);
        // [0, 0, ..., 0].
        System.out.println(Arrays.toString(arr));

        // prints out -
        // inside looking at: 1234
        // second inside looking at: 5678
        // [0, 0]
        touch(arr);

        // same memory address from above - 1234.
        System.out.println(arr);
        // [123, 0, ..., 0], it was changed from inside the method!
        System.out.println(Arrays.toString(arr));

        int[] array1 = {1, 2, 3};
        int[] array2 = {0, 2, 3};
        array2[0] = 1;

        // Comparing memory addresses - this is false.
        // They are looking at different places.
        System.out.println(array1 == array2);
        // True equality, the elements are the same.
        System.out.println(Arrays.equals(array1, array2));

        // Now array3 is looking at the same place as array1.
        int[] array3 = array1;

        // false. This is comparing memory addresses.
        System.out.println(array3 == array2);
        // true. They are looking at the same place.
        System.out.println(array3 == array1);
        // true. Even though they are looking at different places,
        // elements are the same.
        System.out.println(Arrays.equals(array3, array2));

        // New memory address, now array3 is looking elsewhere.
        array3 = new int[3];
        // false.
        System.out.println(array3 == array1);
    }

    public static void touch(int[] intArray) {
        // int[] -> Object -> Mutable
        System.out.println("inside looking at: " + intArray);
        intArray[0] = 123;

        // new int -> get a new memory address
        intArray = new int[2];
        System.out.println("second inside looking at: " + intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
