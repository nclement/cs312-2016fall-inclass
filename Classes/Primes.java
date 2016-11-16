
/**
 * Write a description of class Primes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Primes
{
    /**
     * Checks for the primality of a number.
     * 
     * Returns true iff it's prime
     */
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.ceil(Math.sqrt(num)); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int nextPrime(int N) {
        while(!checkPrime(N++));
        return N;
    }
}
