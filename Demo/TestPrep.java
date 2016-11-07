
/**
 * Write a description of class TestPrep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPrep
{
    public static void main(String[] args) {
        String[] words = new String[10];
        words[5] = "Does this work?";
        
        
        if (1/0 > 5 || words[5].length() < 5 || words[2].length() > 5) {
            System.out.println("Is this an error?");
        }
        System.out.println("No errors here!");
    }
}
