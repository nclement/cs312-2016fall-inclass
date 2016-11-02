public class ShortCircuit {
    public static void main(String[] args) {
        // No errors thrown here.
        System.out.println(1 > 0 || (1 / 0 > 1231231));
        System.out.println(0 > 1 && (1 / 0 > 1231231));
    }
}
