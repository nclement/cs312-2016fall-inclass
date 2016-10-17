
/**
 * Write a description of class StartingDrawing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Graphics;

public class StartingDrawing
{
    public static void main(String[] args) {
        DrawingPanel p1 = new DrawingPanel(800, 500); 
        Graphics gr = p1.getGraphics();
        
        drawCross(gr, 20, 0, 0);
        drawCross(gr, 40, 110, 10);
    }
    
    public static void drawCross(Graphics gr, int size, int x, int y) {
        for(int i = 0; i < 5; i++) {
            gr.fillRect(i * size + x, -i * size + y + size*4, size, size);
        }
        for(int i = 0; i < 5; i++) {
            gr.fillRect(i * size + x, i * size + y, size, size);
        }
    }
}
