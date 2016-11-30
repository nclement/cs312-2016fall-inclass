public class Point {
    private int x;
    private int y;

    // no param constructor
    public Point() {
        this(0,0);
    }

    // multiple params
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void upX(){
        x++;
    }

    public void downX(){
        x--;
    }

    public void upY(){
        y++;
    }

    public void downY(){
        y--;
    }

    public boolean atOrigin(){
        return x == 0 && y == 0;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
