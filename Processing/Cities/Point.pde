public class Point {
  private int x;  // The point's x-coord
  private int y;  // The point's y-coord
  private int size;
  private color c;
  
  /*
  public Point() {
    this(0, 0);
    System.out.println("Point has been created!");
  }
  */
  
  public Point(int px, int py) {
    //System.out.println("Other Point has been created with " + px + ", " + py);
    setPoint(px, py);
  }
  
  
  public void drawPoint() {
    fill(c);
    ellipse(x, y, size, size);
  }
  
  public void setPoint(int px, int py) {
     x = px;
     y = py;
  }
  
  public void setColor(color col) {
    c = col; 
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
    return sqrt(pow(x - p.x, 2.0) + pow(y - p.y, 2.0));
  }
}