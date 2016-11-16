
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
    private String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    private int dayOfTheWeek;
    
    public Date(String day) {
        if (day.equals("Mon")) {
            dayOfTheWeek = 0;
        } else if (day.equals("Tue")) {
            dayOfTheWeek = 1;
        } else if (day.equals("Wed")) {
            dayOfTheWeek = 2;
        } else if (day.equals("Thu")) {
            dayOfTheWeek = 3;
        } else if (day.equals("Fri")) {
            dayOfTheWeek = 4;
        } else if (day.equals("Sat")) {
            dayOfTheWeek = 5;
        } else if (day.equals("Sun")) {
            dayOfTheWeek = 6;
        } else {
            dayOfTheWeek = -1;
        }
    }
    
    public String getDay() {
        if (dayOfTheWeek == -1) {
            return "You entered an incorrect day.";
        }
        return days[dayOfTheWeek];
    }
}
