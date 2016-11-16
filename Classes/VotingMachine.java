
/**
 * Write a description of class VotingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VotingMachine
{
    public static void main(String[] args) {
        VotingBooth booth = new VotingBooth();
        
        // Set up some Scanner connected to a file...
        // Records votes
        booth.makeVote("Clinton");
        booth.makeVote("Trump");
        //booth.numTrumpVotes += 100;
        System.out.println("Percentage won (Clinton): " + booth.percentageCandidate("Clinton"));
        System.out.println("Percentage won (Trump): " + booth.percentageCandidate("Trump"));
    }
}
