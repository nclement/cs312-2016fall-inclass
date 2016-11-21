public class Square {
    private double side;

    public Square() {
        this.side = 1.0;
        System.out.println("im there");
    }

    public Square(double side) {
        this.side = side;
        System.out.println("im here");
    }

    public Square(int side) {
        this.side = side;
        System.out.println("im other there");
    }

    public void grow(int scale) {
        this.side *= scale;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getSide() {
        return this.side;
    }

    public Square merge(Square that) {
        double totalArea = this.getArea() + that.getArea();
        double sideLength = Math.sqrt(totalArea);
        return new Square(sideLength);
    }

    public String toString() {
        return "this is a square: " + this.side;
    }
}
