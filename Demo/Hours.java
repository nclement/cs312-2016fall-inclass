import java.io.*;
import java.util.*;

/**
 * Write a description of class Hours here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hours
{
    public static void main(String[] args) throws FileNotFoundException{
        System.out.print("Enter an ID to search for: ");
        Scanner console = new Scanner(System.in);
        String searchName = console.next();

        int x = 6;
        doStuff(x);
        System.out.println(x);
        
        // Open my data file
        Scanner file = new Scanner(new File("working_hours.txt"));  
        //PrintStream output = new PrintStream(new File("summary.txt"));
        PrintStream output = new PrintStream(System.out);
        
        boolean hasMatched = false;
        // Keep looking at individual lines
        while (file.hasNextLine()) {
            // A
            // Get the next line
            String line = file.nextLine();
            // B
            // Only print out if it matches the requested ID.
            if (matchesName(line, searchName)) {
                // C
                processLine(line, output);
                hasMatched = true;
            }
            // D
        }
        // E
        if (!hasMatched) {
            System.out.println("No matches!");
        }
        output.close();
        file.close();
    }

    public static void doStuff(int x) {
        x *= 3;
    }
    
    public static boolean matchesName(String line, String searchName) {
        return searchName.equals(extractUserName(line));
    }
    
    
    /**
     * This method will return true if the ID of the user on this line matches
     * the ID we are searching for.
     * 
     * @param line the line from the input file
     * @param userID the ID of the user we're searching for
     * @returns true if we should print this line, false otherwise.
     */
    public static boolean matchesID(String line, int userID) {
        int id = extractUserID(line);

        return id == userID;
    }

    public static int extractUserID(String line) {
        Scanner lineScan = new Scanner(line);

        // Process the line
        int id = lineScan.nextInt();
        return id;
    }

    public static String extractUserName(String line) {
        Scanner lineScan = new Scanner(line);
        // Skip the first token
        lineScan.next();
        // Return the name
        return lineScan.next();
    }

    public static void processLine(String line, PrintStream output) {
        Scanner lineScan = new Scanner(line);

        // Process the line
        int id = lineScan.nextInt();
        String name = lineScan.next();
        
        /*
        int id = extractUserID(line);
        String name = extractUserName(line);
        Scanner lineScan = new Scanner(line);
        */

        double total = 0;
        int N = 0;
        while (lineScan.hasNextDouble()) {
            double d = lineScan.nextDouble();
            total += d;
            N++;
        }

        output.printf("%s (ID#%d) worked %.1f hours (%.2f hours/day)\n",
            name, id, total, total/N);

        lineScan.close();
    }
}
