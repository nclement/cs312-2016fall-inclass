
/**
 * Write a description of class DateClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DateClient
{
    public static void main(String[] args) {
        Date d = new Date("Mon");
        System.out.println(d.getDay());
        Date d2 = new Date("Weekend");
        System.out.println(d2.getDay());
        d2.dayOfTheWeek = 7;
        System.out.println(d2.getDay());
    }
}
