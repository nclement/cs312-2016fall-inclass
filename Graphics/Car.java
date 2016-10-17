import java.awt.*;
public class Car {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500); 
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();

        /*
        for (int i = 0; i < 500; i++) {
        drawTruck(g, 1*i, 10);
        panel.sleep(20);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);
        }
         */

        drawTruck(g, 20, 10, 10, Color.RED);
        panel.sleep(20);
        //g.setColor(Color.LIGHT_GRAY);
        //g.fillRect(0, 0, 500, 500);
        drawTruck(g, 40, 100, 150, new Color(207, 83, 0));
        drawTruck(g, 10, 250, 80, new Color(75, 0, 130));
    }

    /**
     * This method will draw a truck at the given x- and y-coordinates
     * 
     * @param g The graphics object to draw with
     * @param size The size of the truck
     * @param x The x-coordinate of the top-left corner of the truck
     * @param y The y-coordinate of the top-left corner of the truck
     * @param windowColor The color of the window
     */
    public static void drawTruck(Graphics g, int size, int x, int y,
          Color windowColor) {
        // Truck body
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10*size, 5*size);

        // Wheels
        g.setColor(Color.RED); 
        g.fillOval(x + size, y + 4*size, 2*size, 2*size);
        g.fillOval(x + 7*size, y + 4*size, 2*size, 2*size);

        // Window
        g.setColor(windowColor);
        g.fillRect(x + 7*size, y + size, 3*size, 2*size); 
    }
    

    
}
