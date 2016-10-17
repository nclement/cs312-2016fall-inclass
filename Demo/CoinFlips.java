
/**
 * Write a description of class CoinFlips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinFlips
{
    public static final int HEADS = 1;
    public static final int TAILS = 2;
    public static final int SHOULDERS = 3;
    
    public static final int FLIPPED_HEADS;
    public static final int FLIPPED_TAILS;

    public static void main(String[] args) {
        int numHeads = heads(10_000_000);
        System.out.println("Number of heads is " + numHeads);

        double d = Math.random();
        int choice = flipType(d);
        System.out.println("My choice is " + choice + ", or " + choiceString(choice));
    }

    /**
     * How many heads are in a given number of flips? This function
     * returns the number of heads when a coin is flipped numFlips
     * number of times.
     *  -> "100 flips gives 50 heads"
     *  -> "20 flips give 15 heads"
     */
    public static int heads(int numFlips) {
        // Math.random() gives number between 0 and 1
        // If Math.random() is greater than 0.5, it's a head

        int numHeads = 0;
        int numTails = 0;
        for (int i = 1; i <= numFlips; i++) {
            double r = Math.random();
            int type = flipType(r, numHeads, numTails);
            if (type == FLIPPED_HEADS) {
                numHeads++;
            } else {
                numTails++;
            }
        }

        return numHeads;
    }

    public static int flipType(double r) {
        if (r >= 0 && r <= 0.1) {
            return FLIPPED_HEADS;
        } else if (r > 0.1 && r < 0.4) {
            return FLIPPED_TAILS;
        } else if (r >= 0.4 && r < 0.7) {
            return FLIPPED_HEADS;
        } else {
            return FLIPPED_TAILS;
        }
    }

    public static String choiceString(int d) {
        if (d == HEADS) {
            return "HEADS";
        } else if (d == SHOULDERS) {
            return "SHOULDERS";
        }

        return "I don't know what it is";
    }
}
