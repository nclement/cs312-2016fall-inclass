import java.awt.*;

public class PointDemo {
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(500, 500);
        Graphics g = dp.getGraphics();
        
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setCoords(45, 10);
        p1.size = 20;
        p2.size = 10;
        
        p1.drawPoint(g);
        p2.drawPoint(g);
    }
}