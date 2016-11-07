import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int[] counts = countCharacters(word);

        for (char i = 'a'; i <= 'z'; i++)
            System.out.println(i + " " + counts[i]);
    }

    public static int[] countCharacters(String word) {
        int[] count = new int[128];

        for (int i = 0; i < word.length(); i++) {
            char tmp = word.charAt(i);
            count[tmp]++;
        }

        return count;
    }
}
