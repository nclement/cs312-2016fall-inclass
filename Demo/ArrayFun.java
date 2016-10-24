import java.util.*;

/**
 * Write a description of class ArrayFun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayFun
{
    public static void main(String[] args) {
        int[] arr = {11, 42, -5, 27, 0, 89};
        System.out.println("begin: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("end  : " + Arrays.toString(arr));
    }

    // Try with arr = {1, 2, 3, 4, 5}
    public static int[] stutter(int[] arr) {
        int[] cee = new int[arr.length * 2];
        // 10
        for (int i = 0; i < cee.length; i++) {
            //  0        0
            // 10        4
            cee[i] = arr[i/2];
        }

        for (int i = 0; i < arr.length; i++) {
            cee[2 * i] = arr[i];
            cee[2 * i + 1] = arr[i];
        }

        return cee;
    }

    /**
     * Swap all the values, but a and b MUST be the same length
     */
    public static void swapAll(int[] a, int[] b) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }

    public static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[i + a.length] = b[i];
        }

    }
    
    public static int[] merge(int[] a, int[] b, int[] c) {
        return merge(a, merge(b, c));
    }
}
