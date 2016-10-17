import java.util.*;

/**
 * Write a description of class Numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numbers
{
    public static void main(String[] args) {
        double avg = randomAverage(20, 0, 10);
        System.out.println("The average is " + avg);
        seven(-1);
    }

    // Prints out all numbers between 0 and n, like:
    // printNumbers(5) -> "0, 1, 2, 3, 4, 5"
    public static void printNumbers(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(n);
    }

    public static double randomAverage(int n, int low, int high) {
        double total = 0;

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            // Random number between [low, high]
            int x = rand.nextInt(high - low + 1) + low;
            total += x;
        }

        return total / n;
    }

    /** 
     * Will roll two 6-sided dice n times, returns true if any
     * of those times it rolled a 7, false otherwise.
     */
    public static boolean seven(int n) {
        Random rand = new Random();
        
        for (int i = 0; i < n; i++) {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            int total = dice1 + dice2;
            
            if(total == 7) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Returns true if I roll a 7 t times in n rolls
     */
    public static boolean sevenTimes(int n, int t) {
        
    }
    
    /**
     * Returns true if I roll a 7 t times in n rolls *in a row*
     */
    public static boolean sevenTimesRow(int n, int t) {
        
    }
    
}
