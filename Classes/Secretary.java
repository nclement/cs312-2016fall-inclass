
/**
 * Write a description of class Secetary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secretary extends Employee
{
    public Secretary() {
        super("Secretary");
    }
    
    public void takeDictation(String text) { 
        System.out.println("Taking dictation of text: " + text);
    }
}