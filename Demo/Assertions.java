import java.util.Scanner;

/**
 * Write a description of class Assertions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assertions
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Y or N: ");
        String result = keyboard.nextLine();
        while (!(result.equals("Y") || result.equals("N"))) {
            System.out.print("You're a moron, Please enter Y or N: ");
            result = keyboard.nextLine();
        }
        // is result equal to "Y" or "N" here?

    }
    public static void mystery(int x, int y) { 
        int z = 0;
        // Point A
        while (x >= y) {
            // Point B
            x = x - y; 
            z++;
            if (x != y) {
                // Point C
                z = z * 2; 
            }
            // Point D
        }
        // Point E
        System.out.println(z); 
    }
}
