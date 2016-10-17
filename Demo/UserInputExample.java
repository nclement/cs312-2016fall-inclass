import java.util.Scanner;


/**
 * Write a description of class UserInputExample here.
 * 
 * @author Nathan Clement 
 * @version Today
 */
public class UserInputExample
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = console.nextInt();
        System.out.print("How much is your hourly wage? ");
        double wage = console.nextInt();
        double thing = wage / age;
        
        System.out.println("You make " + thing  +" dollars per year");
    }
}
