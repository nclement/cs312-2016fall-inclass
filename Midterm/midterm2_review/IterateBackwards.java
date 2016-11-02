public class IterateBackwards {
    public static void main(String[] args) {
        int[] sorted = {1, 2, 3};
        printBackwards(sorted);
    }

    public static void printBackwards(int[] array) {
        for (int i = array.length-1; i > -1; i--)
            System.out.println(array[i]);
    }
}
