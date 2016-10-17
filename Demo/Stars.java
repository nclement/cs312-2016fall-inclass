public class Stars {
    public static void main(String[] args) {
        printNumbers(5);
        //printNumbers(3);
    }
    
    /**
     * 7654321
     * 654321
     * 54321
     * 4321
     * 321
     * 21
     * 1
     */
    
    /**
     * 55555
     * 4444
     * 333
     * 22
     * 1
     */
    
    /**
     * 66666
     * 5555
     * 444
     * 33
     * 2
     */
    public static void printNumbers(int n) {
        // This is the number to print
        int toPrint = 10;
        // This is how many lines to print on each line
        int numStars = 1;
        
        // I know how many lines to run (n lines)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= toPrint; j++) {
                System.out.print(i + "-");
            }
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            
            // I want to change the number I print each time by this much
            toPrint--;
            numStars++;
            System.out.println();
        }
    }
}