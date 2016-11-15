public class Utilities {
    public static int[] countFrequencies(String word) {
        int[] count = new int[256];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i)]++;
        }
        return count;
    }
}
