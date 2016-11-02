public class CheckIfSorted {
    public static void main(String[] args) {
        double[] sorted = {1.1, 2.2, 3.3};
        System.out.println(isSorted(sorted));

        double[] notsorted = {1.1, 20.2, 3.3};
        System.out.println(isSorted(notsorted));
    }

    public static boolean isSorted(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double current = array[i];
            double prev = array[i-1];
            if (current < prev) {
                return false;
            }
        }
        return true;
    }
}
