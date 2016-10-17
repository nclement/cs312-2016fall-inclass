import java.util.Scanner;

/**
 * Write a description of class BMI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BMIComparator
{

    public static void main(String[] args) {
        introduction();
        Scanner console = new Scanner(System.in); 
        String person1 = 
        // Get the BMI from each person.
        double bmi1 = person(console);
        double bmi2 = person(console);
        
        // report overall results
        //report(1, bmi1);
        //report(2, bmi2); 
        
        double x = 15.0;
        x = x + difference(x, 12);
        // -> x = 15 + difference(x, 12)
        // -> x = 15 + 3
        // -> x = 18
        System.out.println();
        
        System.out.println("Difference = " + difference(bmi1, bmi2));
        //"17.0Difference = 7.0"
    }

   // prints a welcome message explaining the program
    public static void introduction() { 
        System.out.println("This program reads ...");
        // ...
    }
    
    public static double person(Scanner console) {
        System.out.print("Enter the height: ");
        double height = console.nextDouble();
        System.out.print("Enter the weight: ");
        double weight = console.nextDouble();
        return 0;
    }
    
    public static double getBMI(double height, double weight) {
        return (weight * 703) / (height * height);
    }

    public static double difference(double a, double b) {
        System.out.print(a + b);
        return Math.abs(a - b);
    }
    
    public static final int USER_WON = 0;
    public static final int COMP_WON = 1;
    public static final int DRAW = 2;
    
    public static   round() {
        int winner = whoWon(___);
        if (winner == USER_WON) {
            userWins++;
        } else if (winner == 
        
        ....
        
        
        resulsts(userWins
    }
    public static int whoWon() {
        if (pick == ROCK && computer == SCISSORS) {
            return USER_WON;
        }
        ..
        ...
    }

}
