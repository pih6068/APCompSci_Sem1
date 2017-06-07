/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("King", "Hearts", 12);
		Card two = new Card("Ace", "Spades", 1);
		Card three = new Card("7", "Diamonds", 7);

		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
	}
}
