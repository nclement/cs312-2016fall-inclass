import java.util.*;


public class Toolbox {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        swapTwos(arr);
        System.out.println(Arrays.toString(arr));

        String a = "abcdef";
        String b = reversed(a);
        System.out.println(b);

        int[] anotherArr = {1, 1, 2, 2, 2, 3, 5};
        int[] count = countStuff(anotherArr, 5);
        System.out.println(Arrays.toString(count));
    }

    public static void swapTwos(int[] arr) {
        // arr = {1, 2, 3, 4}, array of even size (what happens if it's odd?).
        // mutates arr {2, 1, 4, 3}, the array with elements swapped.
        for (int i = 0; i < arr.length; i += 2) {
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }
    }

    public static String reversed(String word) {
        // word = "foobar", the word to reverse.
        // returns "raboof".
        String result = "";
        for (int i = word.length()-1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }

    public static int[] countStuff(int[] arr, int max) {
        // arr = {1, 1, 2, 2, 2, 3, 5}, an array of values from 1 to max, inclusive.
        // max = 5, the max element in the array.
        // returns {0, 2, 3, 1, 0, 1}.
        // count[5] should give me the number of 5s.
        // count[3] should give me the number of 3s, ...
        // Note the size is is max+1. Why? What if it was just max?
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; ++i) {
            int val = arr[i];
            count[val]++;
        }
        return count;
    }
}
