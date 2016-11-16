
/**
 * Write a description of class VotingBooth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VotingBooth
{
    public static final int NUM_CANDIDATES = 3;
    private int numTrumpVotes;
    private int numHillaryVotes;
    private int numOtherVotes;
    private int totalVotes;
    
    public void makeVote(String candidate) {
        if (candidate.equalsIgnoreCase("Trump")) {
            numTrumpVotes++;
        } else if (candidate.equalsIgnoreCase("Clinton")) {
            numHillaryVotes++;
        } else {
            numOtherVotes++;
        }
        
        totalVotes++;
        // Is totalVotes == (numOtherVotes + numTrumpVotes + numHillaryVotes)?
    }
    
    public double percentageCandidate(String candidate) {
        if (candidate.equalsIgnoreCase("Trump")) {
            return (double)numTrumpVotes / totalVotes;
        } else if (candidate.equalsIgnoreCase("Clinton")) {
            return (double)numHillaryVotes / totalVotes;
        } else {
            return (double)numOtherVotes / totalVotes;
        }
    }
}
