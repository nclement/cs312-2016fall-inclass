import java.util.Scanner;

/**
 * Write a description of class Biking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biking
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Is it raining? ");
        // If it's raining, user input is a 1
        int raining = console.nextInt();
        System.out.print("What's the temperature? ");
        double temp = console.nextDouble();

        if (raining == 1) {
            if (temp < 70 || temp > 110) {
                System.out.println("Bad weather for biking");
            } else {
                System.out.println("Good weather!");
            }
        } else if (raining == 0) {
            if (temp < 40) {
                System.out.println("Bad weather for biking");
            } else if (temp > 100) {
                System.out.println("Bad weather for biking");
            } else {
                System.out.println("Good weather!");
            }
        }
    }

    public static void doStuff() {
        int a = 6;
        if (a < 6) {
            a = a + 1;
            System.out.println("a incremented.");
        } else if (a > 6) {
            System.out.println("a is too high.");
        } else {
            System.out.println("a is correctly set.");
        }
    }

}
