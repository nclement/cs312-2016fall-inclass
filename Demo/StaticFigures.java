public class StaticFigures {
    public static void main(String[] args) {
        egg();
        System.out.println();
        teacup();
        System.out.println();
        stopsign();
        System.out.println();
        cap();
        System.out.println();
    }

    /**
     * This will print out the egg shape.
     */
    public static void egg() {
        eggTop();
        eggBottom();
    }

    /**
     * This will print out the teacup.
     */
    public static void teacup() {
        eggBottom();
        dividerLine();
    }

    /**
     * Print out the stop sign.
     */
    public static void stopsign() {
        eggTop();
        System.out.println("|   STOP   |");
        eggBottom();
    }

    /**
     * Print out the cap.
     */
    public static void cap() {
        eggTop();
        dividerLine();
    }

    public static void eggTop() {
        System.out.println("   ______");
        System.out.println("  /      \\");
        System.out.println(" /        \\");
        System.out.println("/          \\");
    }

    public static void eggBottom() {
        System.out.println("\\          /");
        System.out.println(" \\________/");
    }

    public static void dividerLine() {
        System.out.println("+----------+");
    }
}