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
    }
    
    /**
     * Returns true if arr is in ascending order
     * (means that the first is the smallest, second is next, etc)
     * 
     * This method should not modify the input array.
     */
    public static boolean isAscending(int[] arr) {
        return false;
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
