import java.util.*;

public class RemoveInt {
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5};
        int[] toRemove = {1, 3};
        int[] afterwards = removeInts(original, toRemove);

        System.out.println(Arrays.toString(afterwards));
    }

    public static int[] removeInts(int[] original, int[] doNotWant) {
        // first loops use to set the size of the final result array.
        int numberOfThingsIWant = 0;
        for (int i = 0; i < original.length; i++) {
            int currentElement = original[i];
            if (doWant(currentElement, doNotWant)) {
                numberOfThingsIWant++;
            }
        }
        // {0, 0, 0}
        //  |
        // {2, 0, 0}
        //     |
        // {2, 4, 5}
        //        |
        int[] result = new int[numberOfThingsIWant];
        int nextIndex = 0;
        for (int i = 0; i < original.length; i++) {
            int currentElement = original[i];
            if (doWant(currentElement, doNotWant)) {
                result[nextIndex] = currentElement;
                nextIndex++;
            }
        }
        return result;
    }

    public static boolean doWant(int x, int[] thingsIDontWant) {
        // 4
        // {1, 2, 3, 4} => false
        // 5
        // {1, 2, 3, 4} => true
        for (int i = 0; i < thingsIDontWant.length; i++) {
            if (x == thingsIDontWant[i])
                return false;
        }
        return true;
    }
}
