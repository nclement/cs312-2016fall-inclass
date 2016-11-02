public class Assertion {
    public static void main(String[] args) {
        // This method counts the number of factors a given value has.
        System.out.println("1: " + assertionPractice(1));
        System.out.println("2: " + assertionPractice(2));
        System.out.println("3: " + assertionPractice(3));
        System.out.println("9: " + assertionPractice(9));
        System.out.println("10: " + assertionPractice(10));
        System.out.println("20: " + assertionPractice(20));
    }

    public static int assertionPractice(int x) {
        int result = -1;
        int d = 2;
        // POINT A
        if (x > 2) {
            result = 0;
            while (d < x) {
                int r = x % d;
                if (r == 0) {
                    result = result + 1;
                    // POINT B
                }
                d++;
                // POINT C
            }
        }
        // POINT D
        return result;
    }
}
