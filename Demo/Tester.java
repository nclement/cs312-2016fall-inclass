import java.util.*;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int num = console.nextInt();

        String s = doStuff(num);
        s = doStuff(num);
        s = doStuff(num);
        s = doStuff(num);
        s = doStuff(num);
        
        // By this point in the program, s has no knowledg of doStuff
        System.out.println("The response to doStuff is [" + s + "]");

        while (num < 1 || num > 10) {
            System.out.println("Wrong, please do it again.");
            System.out.print("Enter a number between 1 and 10: ");
            num = console.nextInt();
        }

        // I need a number that's between 1 and 10!!
        System.out.println("Is number between 1 and 10? " + num);
    }

    public static String doStuff(int x) {
        System.out.println("My x is " + x);

        String words = "The fat brown cat is in my hat";
        return getStuff(words, x);
    }

    /**
     * This will return the character at position pos in the string.
     */
    public static String getStuff(String s, int pos) {
        if (s.length() < pos) {
            return "";
        }
        return "" + s.charAt(pos);
    }
}
