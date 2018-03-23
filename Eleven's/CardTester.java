
/**
 * Write a description of class CardTester here.
 *
 * @author (Kong)
 * @version (3/23/18)
 */
   /**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card one = new Card("Ace", "Hearts", 1);
        Card two = new Card("Two", "Spades", 2);
        Card three = new Card("Ace", "Hearts", 1);
        
        System.out.println(one.toString());
        
        System.out.println("Card One and Two should not match: " +  two.matches(one));
        System.out.println("Card One and Three should match: " + three.matches(one));
    }
}

