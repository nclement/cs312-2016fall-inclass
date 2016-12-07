import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");

        // invalid, out of bounds.
        // list.get(2);

        // valid. equivalent to list.add("asdf");
        list.add(2, "asdf");
    }

    public static void addStars(ArrayList<String> list) {
        // {foo, bar, hello}
        //    0    1      2
        // {foo, *, bar, *, hello}
        //    0  1    2  3      4
        // Save n, because list.size() changes.
        int n = list.size();
        for(int i = 0; i < n-1; i++) {
            list.add(2 * i + 1, "*");
            System.out.println(list);
        }
    }

    public static double average(int[][] mat, int centerRow, int centerCol,
            int rows, int cols) {
        // Problem 9 on Fall 2015.
        int r = mat.length;
        int c = mat[0].length;

        int topCol = centerCol - cols;
        int topRow = centerRow - rows;

        int botCol = centerCol + cols;
        int botRow = centerRow + rows;

        int sum = 0;
        int counter = 0;

        // iterate over tiny rectangle.
        for (int i = topRow; i <= botRow; i++) {
            for (int j = topCol; j <= botCol; j++) {
                // check in bounds.
                if (i >= 0 && i < r && j >= 0 && j < c) {
                    sum += mat[i][j];
                    counter++;
                }
            }
        }

        return (double) sum / counter;
    }
}
