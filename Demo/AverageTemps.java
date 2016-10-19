import java.util.*;

/**
 * Write a description of class AverageTemps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AverageTemps
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double totalTemps = 0;
        System.out.print("How many days' temperatures? ");

        int numDays = console.nextInt();
        int[] temps = new int[numDays];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(days);
        
        System.out.println("Days is: " + Arrays.toString(days));
        String[] words = new String[10];

        System.out.println(temps[0]);

        System.out.println(words.length);
        System.out.println(words[0]);

        for (int i = 0; i < temps.length; i++) {
            System.out.printf("Day %d's high temp: ", i + 1);
            int temp = console.nextInt();
            temps[i] = temp;
            totalTemps += temp;
        }

        double average = totalTemps / numDays;
        System.out.printf("Average temp = %.2f\n", (totalTemps / numDays));
        int numAbove = 0;
        for (int i = 0; i < numDays; i++) {
            if (temps[i] > average) {
                numAbove++;
            }
        }
        System.out.printf("%d days were above average.", numAbove);

        System.out.println("temps is: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("temps is: " + Arrays.toString(temps));
        System.out.println("The two lowest were: " + temps[0] + ", " + temps[1]);
        System.out.println("The two highest were: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
    }
}