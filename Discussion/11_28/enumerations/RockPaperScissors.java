public class RockPaperScissors {
    public static final int ROCK     = 1;
    public static final int PAPER    = 2;
    public static final int SCISSORS = 3;

    public static final int WIN = 1;
    public static final int DRAW = 2;
    public static final int LOSS = 3;

    // This method uses public static final variables.
    // Returns true if player A wins. Does not account for draws.
    //
    // Motivation: I have a bug in my code, and I want to debug.
    public static boolean win(int a, int b) {
        boolean result = false;

        // But when I print out a and b, I just get numbers...
        // doesn't help me much since I have a lot of public static final variables.
        // Does 1 mean ROCK or WIN?
        System.out.println(a + " " + b);

        result |= (a == ROCK     && b == SCISSORS);
        result |= (a == PAPER    && b == ROCK);
        result |= (a == SCISSORS && b == ROCK);                     // the bug is here.

        return result;
    }

    // This method uses enums!
    // Returns true if player A wins. Does not account for draws.
    //
    // Motivation: I have a bug in my code, and I want to debug.
    public static boolean win(Move a, Move b) {
        boolean result = false;

        // Printing this makes a lot more sense.
        // Since it's an enum, it will actualy print ROCK or PAPER.
        System.out.println(a + " " + b);

        result |= (a == Move.ROCK     && b == Move.SCISSORS);
        result |= (a == Move.PAPER    && b == Move.ROCK);
        result |= (a == Move.SCISSORS && b == Move.ROCK);           // the bug is here.

        return result;
    }

    public static void main(String[] args) {
        // Looks good.
        System.out.println(win(ROCK, SCISSORS));

        // Prints out true?? There's my bug.
        System.out.println(win(Move.SCISSORS, Move.ROCK));
    }
}
