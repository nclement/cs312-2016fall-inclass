import java.util.*;
/**
 * Write a description of class ArrayFun2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayFun2
{
    public static void main(String[] args) {
        int N = 100;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }
        shuffle(arr);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(isAscending2(arr));
    }
    
    /**
     * Returns true if arr is in ascending order
     * (means that the first is the smallest, second is next, etc)
     * 
     * This method should not modify the input array.
     */
    public static boolean isAscending(int[] arr) {
        int count = arr[0];
        for (int i = 0; i < arr.length; i++) {
            // is arr[0] ever < count??
            //  -> A, S, N
            // comparing arr[1] to arr[0]
            if (arr[i] < count) {
                return false;
            }
            // count is now arr[0]
            count = arr[i];
        }
        
        return true;
    }
    
    public static boolean isAscending2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // i = 0
            // if arr[1] < arr[0]
            // length is 10
            // i = 9
            // arr[9] < arr[8]
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * One method to solve:
     *   -> Create an array of N elements
     *      counts[i] -> # of times i occurs
     *      for (int i = 0; i < arr.length; i++) {
     *        counts[arr[i]]++;   
     *      }
     *      
     *      = what if N is 10?
     *      = what if N is 1_000_000_000_000
     */
    public static boolean containsDuplicates(int[] arr, int N) {
        int repeated = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeated++;
                }
            }
        }
        if (repeated > arr.length) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Fisher-Yates Shuffling Algorithm
     */
    public static void shuffle(int[] arr) {
        Random rand = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            // Get a random index
            int r = rand.nextInt(arr.length);
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
    }
}
