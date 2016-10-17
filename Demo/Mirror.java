
/**
 * Prints out a mirror, using the global variable SIZE.
 * 
 * @author Nathan Clement
 */
public class Mirror
{
    public static final int SIZE = 3;
    
    public static void main(String[] args) {
        // Prints the #===...==#
        equalsLine();
        topHalf();
        bottomHalf();
        equalsLine();
    }

    public static void equalsLine() {
        //System.out.println("#================#");
        System.out.print("#");
        for (int i = 1; i <= 4*SIZE; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void topHalf() {

        for (int i = 1; i <= SIZE; i++) {
            // Print the bar
            System.out.print("|");
            // Print some spaces
            for (int j = 1; j <= -2 * i + 2 * SIZE; j++) {
                System.out.print(" ");
            }
            // Print the alligator
            System.out.print("<>");
            // Print the dots
            for (int j = 1; j <= 4 * i - 4; j++) {
                System.out.print(".");
            }
            // Another alligator
            System.out.print("<>");
                // Print some spaces
            for (int j = 1; j <= -2 * i + 2 * SIZE; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        // Print the alligator
    }

    public static void bottomHalf() {
        for (int i = 1; i <= SIZE; i++) {

        }
    }
}
