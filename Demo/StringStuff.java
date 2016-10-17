
/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringStuff
{

    public static void main(String[] args) {
        System.out.println(firstWord("nowords"));
        System.out.println(firstWord("good morning"));
        System.out.println(firstWord("    some spaces"));
        System.out.println("All done!");
    }

    public static String firstWord(String sentence) {
        for (int = 0; i < sentence.size(); i++) {
            
        }
        int firstNonSpace = sentence.indexOf(!" ");
        sentence = sentence.substring(firstNonSpace);

        int firstSpace = sentence.indexOf(" ");
        if (firstSpace == -1) {
            return sentence;
        }
        return sentence.substring(0, firstSpace);
    }
}
