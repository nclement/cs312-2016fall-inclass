
/**
 * Write a description of class Quiz1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quiz1
{
    public static final int SIZE = 5;
    
    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            
            System.out.print("|");
            for (int j = 1; j < SIZE*2; j++) {
                System.out.print("*-");
            }
            System.out.print("|*");
            System.out.println();
        }
    }
}
