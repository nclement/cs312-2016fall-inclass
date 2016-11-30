import java.awt.*;

public class PointDemo {
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(500, 500);
        Graphics g = dp.getGraphics();
        
        Point p1 = new Point(45, 10);
        
        Point p2 = new Point(20, 30);
        
        p1.drawPoint(g);
        p2.drawPoint(g);
        
        Point e1 = new Point(45, 10);
        System.out.println("Same? " + e1.equals(p1));
        System.out.println("Same? " + e1.equals("Point 1"));
    }
}