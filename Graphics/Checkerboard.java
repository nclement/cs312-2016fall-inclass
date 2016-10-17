import java.awt.Graphics;

/**
 * Write a description of class Crosses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkerboard
{
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 400);
        Graphics g = panel.getGraphics();
        check(g);
        //cross(g);
        //plus(g);
    }

    public static void check(Graphics g) {
        int size = 40;

        g.drawRect(0, 0, 5*size, 5*size);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                g.fillRect(i*size, j*size + (i+j)%2*size, size, size);
            }
        }
    }

    public static void cross(Graphics g) {
        int size = 40;
        for (int i = 0; i < 5; i++) {
            g.fillRect(i*size, i*size, size, size);
        }
        for (int i = 0; i < 5; i++) {
            g.fillRect(-i*size+size*4, i*size, size, size);
        }
    }

    public static void plus(Graphics g) {
        int width = 6;
        int size = 20;
        for (int i = 0; i < width; i++) {
            g.drawRect(i * size, size * width / 2, size, size);
        }
        for (int i = 0; i < width; i++) {
            g.drawRect(size * width / 2, i * size, size, size);
        }
    }
}
