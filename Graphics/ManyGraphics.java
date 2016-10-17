
/**
 * Write a description of class ManyGraphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Polygon;

public class ManyGraphics
{
    public static void main(String[] args) {
        DrawingPanel p1 = new DrawingPanel(600, 100);
        DrawingPanel p2 = new DrawingPanel(600, 600);
        
        Graphics g1 = p1.getGraphics();
        Graphics g2 = p2.getGraphics();
        
        drawStuff(g1);
        drawStuff(g2);
    }
    public static void drawStuff(Graphics g) {
        Polygon poly = new Polygon();
        poly.addPoint(10, 90);
        poly.addPoint(50, 10); 
        poly.addPoint(90, 90); 
        g.fillPolygon(poly);
        
        
        // x = 50;
    }
}
