import java.util.*;

/**
 * Write a description of class NextPrime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextPrime
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = scan.nextInt();

        // Will print out the next prime number *after* N
        // For example:
        // Input: 10
        // Prints: 11

        // Input: 2
        // Prints: 3

        // Input: 13
        // Print: 17

        //while(!checkPrime(N++));
        int nextPrime = Primes.nextPrime(N);
        // ASSERTION: If I'm here, is N prime?
        System.out.println("Next number is: " + nextPrime);
    }
}
