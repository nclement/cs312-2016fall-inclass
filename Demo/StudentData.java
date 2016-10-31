import java.util.*;
import java.io.*;

/**
 * Write a description of class StudentData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentData
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("attendance.txt"));
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println("Section " + i);
            singleLineOutput(scan.nextLine());
            i++;
        }
    }
    
    /**
     * Function that takes a single line of input and produces
     * three lines of output.
     */
    public static void singleLineOutput(String line) {
        System.out.println("line is: " + line);
        int[] counts = new int[5];
        
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int score;
            if (c == 'y') {
                score = 3;
            } else if (c == 'n') {
                score = 2;
            } else {
                score = 0;
            }
            
            int studentNum = i % 5;
            counts[studentNum] += score;
        }
        
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 20) {
                counts[i] = 20;
            }
        }
        System.out.println("Student points: " + Arrays.toString(counts));
    }
}
