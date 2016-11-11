import java.util.*;
import java.awt.*;

public class Point {
    private int x;  // The point's x-coord
    private int y;  // The point's y-coord
    int size;

    double distanceTo711;
    String nameOfFavoriteTVShow;
    boolean didIVoteCorrectly;

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
}