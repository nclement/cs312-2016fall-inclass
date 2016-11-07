class Point {
  private int x;  // The point's x-coord
  int y;  // The point's y-coord
  int size;
  color c;
  
  double distanceTo711;
  String nameOfFavoriteTVShow;
  boolean didIVoteCorrectly;
  
  public void drawPoint() {
    ellipse(x, y, size, size);
  }
}