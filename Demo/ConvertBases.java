
/**
 * Write a description of class ConvertBases here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConvertBases
{
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            fact(i + 0.0);
        }
    }
    
    public static void fact(int N) {
        int total = 1;
        
        for (int i = N; i > 0; i--) {
            total *= i;
        }
        
        System.out.println("The factorial of " + N + " is: " + total);
    }
    
    public static void binary() {
        int binary = 1011001;
        int power2 = 1;
        
        int total = 0;
        
        for (int i = 0; i <= 6; i++) {
            int digit = binary % 2;
            total += power2 * digit;
            power2 *= 2;
            
            binary = binary / 10;
        }
        
        System.out.println(total);
    }
}
