import java.util.*;
import java.io.*;
import java.net.*;

/**
 * Write a description of class Averages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Averages
{
    public static void main(String[] args) throws Exception {
        /* 
         * Problem to solve:
         *   I'm gonna give you a bunch of numbers. Eventually,
         *   I'll give you a -1. As soon as I do this, I want
         *   you to give me the average of all the numbers I've 
         *   just given you.
         *   
         *    - Check each number I've been given and see if it's
         *      a -1
         *    - *While* I'm getting numbers, keep track of how many
         *      I've been given
         *    - Create a *running total* of the sum of the numbers
         *    - As soon as I have a -1, divide the running total
         *      by the *number you've counted so far*.
         */

        //String mabryTemps = "http://www.cs.utexas.edu/~nclement/cs302/2015Spring/campmabry_tmax_1015_F.txt";
        //URL url = new URL(mabryTemps);
        //Scanner console = new Scanner(new InputStreamReader(url.openStream()));
        Scanner console = new Scanner(new File("mydata.txt"));

        double total = 0;
        int N = 0;
        System.out.println("Enter your numbers: ");
        while(console.hasNext()) {
            if (console.hasNextDouble()) {
                double userInput = console.nextDouble();
                // Running total
                total += userInput;
                // Number I've counted so far
                N++;
            } else {
                console.next();
            }
        }
        // Compute and report the average
        System.out.println("The average of " + N + " numbers is: " + (total / N));
    }

    public static void printAverage(String path, boolean isURL) {
        Scanner console;
        if (isURL) {
            try {
                URL url = new URL(path);
                console = new Scanner(new InputStreamReader(url.openStream()));
            }
            catch(MalformedURLException e) {
                System.out.println("Error: Your URL was not formed correctly.");
                System.out.println("The error message was: " + e.getMessage());
                System.out.println("Quitting early.");
                return;
            }
            catch(IOException e) {
                System.out.println("Error: Something wrong with IO.");
                System.out.println("The error message was: " + e.getMessage());
                System.out.println("Quitting early.");
                return;
            }

        } else {
            try {
                console = new Scanner(new File(path));
            }
            catch(FileNotFoundException e) {
                System.out.println("Your file was not found!!");
                System.out.println("The error message was: " + e.getMessage());
                System.out.println("Quitting early.");
                return;
            }
        }

        double total = 0;
        int N = 0;
        System.out.println("Enter your numbers: ");
        while(console.hasNext()) {
            if (console.hasNextDouble()) {
                double userInput = console.nextDouble();
                // Running total
                total += userInput;
                // Number I've counted so far
                N++;
            } else {
                console.next();
            }
        }
        // Compute and report the average
        System.out.println("The average of " + N + " numbers is: " + (total / N));
    }

    public static double getAverage(String path, boolean isURL) 
                throws MalformedURLException, IOException {
        Scanner console;
        if (isURL) {
            URL url = new URL(path);
            console = new Scanner(new InputStreamReader(url.openStream()));
        } else {      
            console = new Scanner(new File(path));
        }

        double total = 0;
        int N = 0;
        while(console.hasNext()) {
            if (console.hasNextDouble()) {
                double userInput = console.nextDouble();
                // Running total
                total += userInput;
                // Number I've counted so far
                N++;
            } else {
                console.next();
            }
        }
        // Compute and report the average
        return total / N;
    }

}
