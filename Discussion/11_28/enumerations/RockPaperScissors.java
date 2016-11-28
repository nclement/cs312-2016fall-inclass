public class RockPaperScissors {
    public static final int ROCK     = 1;
    public static final int PAPER    = 2;
    public static final int SCISSORS = 3;

    // This method uses public static final variables.
    // Returns true if player A wins. Does not account for draws.
    public static boolean win(int a, int b) {
        boolean result = false;
        result = result || (a == ROCK     && b == SCISSORS);
        result = result || (a == PAPER    && b == ROCK);
        result = result || (a == SCISSORS && b == ROCK);
        return result;
    }

    // This method uses enums!
    // Returns true if player A wins. Does not account for draws.
    public static boolean win(Move a, Move b) {
        boolean result = false;
        result = result || (a == Move.ROCK     && b == Move.SCISSORS);
        result = result || (a == Move.PAPER    && b == Move.ROCK);
        result = result || (a == Move.SCISSORS && b == Move.ROCK);
        return result;
    }

    public static void main(String[] args) {
        boolean rockVsPaper = win(Move.ROCK, Move.PAPER);

        System.out.println(rockVsPaper);
    }
}
