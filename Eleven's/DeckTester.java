
/**
 * Write a description of class DeckTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeckTester
{
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            String[] rank1 = {"Jack", "Queen", "King"};
            String[] suit1 = {"Hearts", "Spades", "Diamonds", "Clubs"};
            int[] value1 = {11, 12, 13};
        Deck deck1 = new Deck(rank1, suit1, value1);
        System.out.println("Deck1 Size should be 3: " + deck1.size());
        
            String[] rank2 = {"1", "2", "3"};
            String[] suit2 = {"Hearts", "Spades", "Diamonds", "Club"};
            int[] value2 = {1,2,3,};
        Deck deck2 = new Deck(rank2, suit2, value2);
        System.out.println("Deck2 size should not be empty: " + !deck2.isEmpty());
        
            String[] rank3 = {"4", "5", "6"};
            String[] suit3 = {"Hearts", "Spades", "Diamonds", "Clubs"};
            int[] value3 = {4,5,6};
        Deck deck3 = new Deck(rank3, suit3, value3);
        System.out.println("One card from Deck3 will be dealt: "+ deck3.deal());
        
    }
}
