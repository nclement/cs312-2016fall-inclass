
/**
 * Write a description of class Cumulative here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cumulative
{
    public static void main(String[] args) {
        System.out.println("The total of 2^5 is " + pow(2, 5));
    }
    
    /**
     * Returns the result of a base raised to some exponent
     */
    public static int pow(int base, int exponent) {
        int total = base;
        for (int i = 1; i < exponent; i++) {
            total *= base;
        }
        return total;
    }
}
