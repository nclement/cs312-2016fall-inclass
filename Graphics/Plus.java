
/**
 * Write a description of class Plus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Graphics;

public class Plus
{
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(150, 150);
        Graphics g = dp.getGraphics();

        plus2(g, 10, 20, 11);
    }

    public static void plus(Graphics g, int x, int y, int size) {
        for (int i = 0; i <= 2 * size; i++) {
            g.fillOval(x + (i-size)*size, y, size, size);
        }
        for (int i = 0; i <= 2 * size; i++) {
            g.fillOval(x, y + (i-size)*size, size, size);
        }
    }

    public static void plus2(Graphics g, int x, int y, int size) {
        for (int i = 0; i < size; i++) {
            g.fillOval(x + i*size, y + size*size/2, size, size);
        }
        for (int i = 0; i < size; i++) {
            g.fillOval(x + size*size/2, y + i*size, size, size);
        }
    }
}
