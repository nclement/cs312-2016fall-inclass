
/**
 * Write a description of class Rhyme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Rhyme
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type two words: ");

        String word1 = console.next().toLowerCase();
        String word2 = console.next().toLowerCase();

        // check whether they end with the same two letters
        if (doesRhyme(word1, word2)) { 
            System.out.println("They rhyme!");
        }
        // check whether they alliterate
        if (doesAlliterate(word1, word2)) { 
            System.out.println("They alliterate!");
        }
        
        System.out.println("The number of vowels in word 1 is: " + numVowels(word1));
        System.out.println("The number of vowels in word 2 is: " + numVowels(word2));
    }
    
    public static boolean getAlphabet() {
        String alph = "";
        for (char a = 'A'; a <
    }
    
    public static boolean isLetter(String w) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if (alphabet.contains("" + w.charAt(0))) {
           return true; 
        }
        return false;
    }
    
    public static boolean doesRhyme(String word1, String word2) {
        return word2.length() >= 2 && word1.endsWith(word2.substring(word2.length() - 2));
    }
    
    public static boolean doesAlliterate(String word1, String word2) {
        return word1.startsWith(word2.substring(0, 1));
    }
    
    public static boolean isNotVowel(String letter) {
        return !isVowel(letter);
    }
    public static boolean isVowel(String letter) {
        if (letter.equals("Y")) {
            return Math.random() > 0.2;
        }
        /*
        return letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u");
        */
        String vowels = "aeiou";
        return vowels.contains(letter.toLowerCase());
    }
    
    /**
     * 0 1 2 3 4
     * H E L L O
     * 
     * Print:
     * H * L L *
     */
    public static int numVowels(String word) {
        int numV = 0;
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains("" + word.charAt(i))) {
                System.out.print("*");
                numV++;
            } else {
                System.out.print(word.charAt(i));
            }
        }
        return numV;
    }
    
}
