import java.awt.Color;

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Critter
{
    private int numFights;
    private int numMoves;
    
    public Snake(boolean north) {
        numFights = 0;
        numMoves = 0;
    }

    public Color getColor() {
        return Color.YELLOW;
    }

    public String toString() {
        return "K";
    }

    public boolean eat() {
        return true;
    }

    // 5 steps north, pause 5 steps, 5 steps north, pause 5 steps, etc, etc, etc...
    public Direction getMove() {
        if (numMoves % 10 < 5) {
            numMoves++;
            return Direction.NORTH;
        }
        numMoves++;
        return Direction.CENTER;
    }

    public Attack fight(String opponent) {
        if (numFights % 2 == 0) {
            numFights++;
            return Attack.SCRATCH;
        } else {
            numFights++;
            return Attack.ROAR;
        }
    }
}
