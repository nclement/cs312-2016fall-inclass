
/**
 * Write a description of class Design here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Design
{
    public static void main(String[] args) {
        printDesign();
    }

    /**
     * -----1-----
     * ----333----
     * ---55555---
     * --7777777--
     * -999999999-
     */
    public static void printDesign() {
        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 6); j++) {
                System.out.print("-");
            }
            int numPrint = 2 * line - 1;
            for (int j = 1; j <= numPrint; j++) {
                System.out.print(numPrint);
            }
            for (int j = 1; j <= (-1 * line + 6); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
