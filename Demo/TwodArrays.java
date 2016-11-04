import java.util.*;

/**
 * Write a description of class TwodArrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwodArrays
{
    public static void main(String[] args) {
        int[][] mat = new int[8][10];
        fillArray(mat);
        printArray(mat);
        System.out.println("Max is: " + getMaxElement(mat));
        System.out.println("Max rows: " + Arrays.toString(getMaxElements(mat)));
        System.out.println("Max rows: " + Arrays.toString(getMaxColElements(mat)));
    }

    public static void printArray(int[][] mat) {
        // Each i represents a row
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }

    public static void fillArray(int[][] mat) {
        Random rand = new Random();
        // Each i represents a row
        for (int i = 0; i < mat.length; i++) {
            // Each j represents a column
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = -1 * rand.nextInt(1000);
            }
        }
    }

    public static int getMaxElement(int[][] mat) {
        if (mat.length == 0) {
            return 0;
        }

        int result = mat[0][0];
        //int result = Integer.MIN_VALUE;
        // Each i represents a row
        for (int i = 0; i < mat.length; i++) {
            // Each j represents a column
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > result) {
                    result = mat[i][j];
                }
            }
        }

        return result;
    }

    /**
     * Method returns the maximum element in *each* row.
     */
    public static int[] getMaxElements(int[][] mat) {
        int[] maxs = new int[mat.length];
        // Each i represents a row
        for (int i = 0; i < mat.length; i++) {
            int result = mat[i][0];
            // Each j represents a column
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > result) {
                    result = mat[i][j];
                }
            }
            // Now, result is the max of the row.
            maxs[i] = result;
        }

        return maxs;
    }

    /**
     * Method returns the maximum element in each *column*.
     * 
     * We don't know if the matrix is square, but we require the
     * matrix to be _rectangular_ (i.e. same number of columns on
     * each row).
     */
    public static int[] getMaxColElements(int[][] mat) {
        int[] maxs = new int[mat[0].length];
        // Each i represents a row
        for (int j = 0; j < mat[0].length; j++) {
            //for (int i = 0; i < mat.length; i++) {
            int result = mat[0][j];
            // Each j represents a column
            for (int i = 0; i < mat.length; i++) {
                //for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > result) {
                    result = mat[i][j];
                }
            }
            // Now, result is the max of the row.
            maxs[j] = result;
        }

        return maxs;
    }
}
