import java.util.*;

/**
 * Write a description of class AStars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AStars
{
    public static void main(String[] args) {
        ArrayList<String> stuff = new ArrayList<String>();
        stuff.add("first");
        stuff.add("second");
        stuff.add(1, "third");
        
        // It now looks like [first, third, second]
        System.out.println(stuff);
        addStars(stuff);
        System.out.println(stuff);
        // It should print out ["first", "*", "third", "*", "second", "*"];
        
        ArrayList<String> newList = new ArrayList<String>();
        printStars(newList);
        System.out.println(newList);
    }
    
    /**
     * This function will take an ArrayList of Strings and add
     * a single star between each element.
     * 
     * Modifies the input, does not return anything.
     */
    public static void addStars(ArrayList<String> list) {
        //                  original size * 2
        int originalSize = list.size();
        for (int i = 0; i < originalSize * 2 - 1; i += 2) {
            list.add(i + 1, "*");
        }
    }
    
    
    public static void printStars(ArrayList<String> list) {
        // Check to make sure it's not empty.
        if (list.size() == 0) {
            System.out.println("[]");
            return;
        }
        
        // Prints out the expected result.
        System.out.print("[");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", *, ");
        }
        System.out.println(list.get(list.size() - 1) + ", *]");
    }
}
