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
        /*
        double avg = randomAverage(20, 0, 10);
        System.out.println("The average is " + avg);
        seven(-1);
         */
        int num = 13895792;
        System.out.println("For " + num + ", number of 7s is " + countNum(num, 7));
        System.out.println("For " + num + ", number of 9s is " + countNum(num, 9));
        num = 669260267;
        System.out.println("For " + num + ", max digit is " + mostFrequentDigit(num));
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
        return false;
    }

    /**
     * Returns true if I roll a 7 t times in n rolls *in a row*
     */
    public static boolean sevenTimesRow(int n, int t) {
        return false;
    }

    /**
     * Will count up and return how many numbers of *digit* are
     * found in *number*
     * 
     * For example,
     *   countNum(12551352, 1) returns 2
     *   countNum(12551352, 5) returns 3
     */
    public static int countNum(int number, int digit) {
        // grab each digit of the number, call it d
        //    if d is the same as digit
        //        increment a counter
        // return the counter

        int count = 0;
        while (number > 0) {
            // number is 13485
            // sets d to 5
            int d = number % 10;
            // sets number to 1348
            number /= 10;

            // add to the counter
            if (d == digit) {
                count++;
            }
        }

        return count;
    }

    /**
     * Returns the max digit in number
     */
    public static int mostFrequentDigit(int number) {
        // grab each digit of the number, call it d
        //    if d is the same as digit
        //        increment a counter
        // return the counter

        int[] counts = new int[10];
        while (number > 0) {
            // number is 13485
            // sets d to 5
            int d = number % 10;
            // sets number to 1348
            number /= 10;

            // add to the counter
            counts[d]++;
        }

        int maxIdx = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > counts[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
