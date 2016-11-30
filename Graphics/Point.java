import java.util.*;
import java.awt.*;

public class Point {
    private int x;  // The point's x-coord
    private int y;  // The point's y-coord
    private int size;
    
    private static double tooClose = 1e-6;

    double distanceTo711;
    String nameOfFavoriteTVShow;
    boolean didIVoteCorrectly;

    public Point(int xPos, int yPos) {
        setCoords(xPos, yPos);
    }
    
    public void setCoords(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void drawPoint(Graphics g) {
        g.fillOval(x, y, size, size);
    }
    
    public static void setCloseness(double d) {
        tooClose = d;
    }
    
    // Gives distance between two points.
    public static double getDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    
    public static boolean samePoint(Point p1, Point p2) {
        return getDistance(p1, p2) < tooClose;
    }
    
    public boolean equals(Point po) {
        if (x == po.x && y == po.y) {
            return true;
        }
        return false;
        /*
        System.out.println("Checking here for equals of " + obj);
        if (obj instanceof Point) {
            Point po = (Point)obj;
            if (x == po.x && y == po.y) {
                return true;
            }
        }
        return false;
        */
    }
    
    /*
    public boolean equals(Object obj) {
        System.out.println("Checking for equals of " + obj);
        return this == obj;
    }
    */
}


