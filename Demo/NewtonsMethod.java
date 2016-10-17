public class NewtonsMethod {
    public static void main(String[] args) {
        //newtons(57);
        
        int N = 57;
        double sqrt = Math.sqrt(N);
        System.out.println("The sqare root of " + N + " is " + sqrt);
        double approx = newtons(N);
        System.out.println("The approx is  of " + N + " is " + approx);

        int d = digit(57, 1);
        System.out.println(d);
        
        int x = (int)Math.pow(2, 3);

        // Make sure that x is alway non-negative at this point
        x = Math.max(x, 0);
        x = Math.min(x, 100);

    }
    public static double newtons(int N) {
        double approx = N / 2.0;

        for (int i = 1; i <= 10; i++) {
            approx = (N / approx + approx) / 2.0;
            //System.out.println("An approximation of the sqrt of " + N + " is " + approx);
            //System.out.println("Squared: " + (approx * approx));
        }

        return approx;
    }
    
    
    /**
     * <p>This will return the expected digit in {@code num}</p>
     * 
     * <p>For example:
     * <pre>
     *   digit(57, 1) -> 7
     *   digit(485129, 3) -> 1
     *   digit(379680208, 6) -> 6
     * </pre></p>
     * 
     * @param num The number from which to draw the digit
     * @param place The place of the digit
     * @return Returns the digit at that place
     */
    public static int digit(int num, int place) {
        for (int i = 1; i < place; i++) {
            num /= 10;
        }
        
        return num % 10;
    }
    
    public static int firstdigit(int num) {
        return num % 10;
    }
}