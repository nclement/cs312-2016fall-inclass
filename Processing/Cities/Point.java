import processing.core.*;

/**
 * This Point class is now "pure" Java, which means the 
 * code is not a sub-class of Cities. Usually, when making
 * a new class, Processing does a lot of magic that wraps
 * everything up in a nice bundle and gives it to the user.
 * However, if we want to use private or static variables, we
 * need to overrun some of these things. For this reason,
 * we'll need to make a few additional changes. One of the major
 * changes is a class member variable of type PApplet.
 * Another major change is that the simplified functions (sqrt,
 * pow, rand) are no longer available to us in their simplified
 * form.
 */
public class Point {
  // This gives us access to drawing on the app.
  private PApplet p;

  private int x;  // The point's x-coord
  private int y;  // The point's y-coord
  private int size;
  private int myColor;

  // Static variable that is "shared" by every object created.
  static int globalID = 0;
  // This one is *mine* (i.e. not "shared")
  private int myID;

  /*
  public Point() {
   this(0, 0);
   System.out.println("Point has been created!");
   }
   */

  // Constructor needs to have the PApplet in order to work.
  public Point(PApplet p, int px, int py) {
    //System.out.println("Other Point has been created with " + px + ", " + py);
    setPoint(px, py);
    this.p = p;

    // Set my ID as the next available ID.
    myID = globalID;
    globalID++;
  }


  public void drawPoint() {
    p.fill(myColor);
    p.ellipse(x, y, size, size);
  }

  public void setPoint(int px, int py) {
    x = px;
    y = py;
  }

  public int getID() {
    return myID;
  }

  public void setColor(int col) {
    myColor = col;
  }

  public void setSize(int s) {
    size = s;
  }
  public int getSize() {
    return size;
  }

  public void translatePoint(int dx, int dy) {
    this.setPoint(x + dx, y + dy);
  }

  public double distance(Point p) {
    return Math.sqrt(Math.pow(x - p.x, 2.0) + Math.pow(y - p.y, 2.0));
  }
}