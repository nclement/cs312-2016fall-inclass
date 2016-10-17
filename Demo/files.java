import java.io.*;
import java.util.*;

/**
 * Write a description of class files here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class files
{
    public static void main(String[] args) {
        File dat = new File("/Users/nclement/Teaching/cs312/2016Fall/inclass/Demo/mydata.txt");

        printWorkingDirectory();

        if (dat.exists()) {
            System.out.println("The file exists!");
        } else {
            System.out.println("No file :(");
        }

        try {
            Scanner dataFile = new Scanner(dat);
            String s = dataFile.next();
            System.out.println("The first string is " + s);
        }
        catch(FileNotFoundException e) {
            System.out.println("The error is: " + e.getMessage());
        }
    }

    public static void printWorkingDirectory() {
        System.out.println("Working Directory = " +
            System.getProperty("user.dir"));
    }
    
    public static int getFirstInt(String filename) throws FileNotFoundException{
        Scanner dat = new Scanner(new File(filename));
        return dat.nextInt();
    }
}
