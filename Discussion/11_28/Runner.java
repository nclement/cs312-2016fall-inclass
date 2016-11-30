public class Runner {
    public static void main(String[] args) {
        // number 1
        Point p1 = new Point();
        System.out.println( p1 );

        // number 2
        Point p2 = new Point(2, 1);
        System.out.println( p2 );

        // number 3
        Point p3 = new Point(0, 3);
        p3.upX();
        p3.downY();
        System.out.println( p3 );

        // number 4
        Point p4 = new Point(2, 1);
        p4.downX();
        p4.downY();
        p4.downX();
        System.out.println( p4.atOrigin() );

        // number 5
        Point p5a = new Point(2, 1);
        Point p5b = new Point(2, 1);
        System.out.println( p5a == p5b );

        // number 6
        Point p6a = new Point(-1, 1);
        Point p6b = p6a;
        p6a.upX();
        p6b.downY();
        p6a.upX();
        System.out.print( p6a + " " + p6b);
        System.out.println( p6b );

        // number 7
        /* Point p7 = new Point(1, 1); */
        /* p7.x += 3; */
        /* System.out.println( p7 ); */

        // number 8
        Point p8a = new Point(1, 3);
        p8a.upY();
        Point p8b = p8a;
        p8b.upX();
        p8a.upY();
        System.out.println( p8a + " " + p8b );
    }
}
