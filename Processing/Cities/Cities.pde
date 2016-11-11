void setup() {
  size(400, 400);
  Point p1 = new Point(200, 50);
  Point p2 = new Point(23, 100);
  
  p1.size = 20;
  p1.c = color(255, 255, 255);
  
  p2.size = 50;
  
  System.out.println("The y-coord for p2 is " + p2.y);
  
  p1.drawPoint();
  p2.drawPoint();
}