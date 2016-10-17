
/**
 * Write a description of class Quiz2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quiz2
{
    public static void main(String[] args) {
        q2();
    }
    public static void q2() {
        int x = 5;
        int y = 6;
        System.out.println("x = " + x + " and y = " + y);
        skyAboveClouds(x, y);
        System.out.println("x + y = " + (x + y));
    }

    public static void skyAboveClouds(int x, int y) {
        x++;
        System.out.println("x = " + x + " and y = " + y);
        y = x * 3;
        System.out.println("x + y = " + (x + y));
    }

    public static void q1() {
        int one = 3;
        int two = 2;
        int three = 4;
        racket(one, two, three);
        //racket(three, one, 2 * 1.5);
        //net(2, two * 2, one);
        net(8, three * one);
    }

    public static void racket(int two, int one, int three) {
        System.out.println(three + " is roughly " + two + " plus " + one);
    }

    public static void net(int four, int eight) {
        System.out.println(eight + " is never more than " + eight);
        racket(eight, four, four * 2);
    }

}
