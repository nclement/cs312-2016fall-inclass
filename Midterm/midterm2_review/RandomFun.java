import java.util.*;

public class RandomFun {
    public static void main(String[] args) {
        Random rand = new Random();

        // what are the possible values of x?
        int x = ((rand.nextInt(4) * 3) + 2) / 2;
        // 0, 1, 2, 3
        // 0, 3, 6, 9
        // 2, 5, 8, 11
        // 1, 2, 4, 5
        countRandoms(10000);
    }

    public static void countRandoms (int n) {
        Random rand = new Random();

        // This is 6 because i know the max value will be 5.
        int[] counter = new int[6];

        for (int i = 0; i < n; ++i) {
            int val = ((rand.nextInt(4) * 3) + 2) / 2;
            counter[val]++;
        }

        System.out.println(Arrays.toString(counter));
    }
}
