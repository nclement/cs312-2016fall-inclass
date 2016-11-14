import java.util.*;

/**
 * Write a description of class PrimeCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimeCount
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the highest number: ");
        int N = scan.nextInt();

        System.out.println("The prime numbers up to that number are: ");

        // If I entered 11:
        // Should display:
        //   2, 3, 5, 7, 11

        // If I entered 3:
        // Should display:
        //   2, 3

        if (N >= 2) {
            System.out.print("2");
            for (int i = 3; i <= N; i++) {
                if (Primes.checkPrime(i)) {
                    System.out.print(", " + i);
                }
            }
        }
    }
}
