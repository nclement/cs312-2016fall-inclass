
/**
 * Write a description of class DashBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DashBar
{
    public static void main(String[] args) {
        drawThing(3);
        System.out.println();
        drawThing(5);
    }

    // Where are the vertical bars??
    public static void drawThing(int size) {
        for (int i = 0; i < size; i++) {
            // A
            for (int j = 0; j < size - i; j++) {
                System.out.print("*");
                // B
            }
            // C
            for (int j = 0; j < i; j++) {
                System.out.print("-");
                // D
                
                // A -> 0
                // B -> 1
                if (j % 2 == 0) {
                    System.out.print("|");   
                }
            }
            // E
            System.out.println();
        }
    }
}
