/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2",
                        "Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2",
                        "Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2",
                        "Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

        String[] suits = new String[ranks.length];
        int[] points = new int[ranks.length];

		for (int i = 0; i < 13; i++)
		{
            suits[i] = "Spades";
            points[i] = 13 - i;
        }
        for (int i = 0; i < 13; i++)
        {
            suits[i + 13] = "Hearts";
            points[i + 13] = 13 - i;
        }
        for (int i = 0; i < 13; i++)
        {
            suits[i + 26] = "Clubs";
            points[i + 26] = 13 - i;
        }
        for (int i = 0; i < 13; i++)
        {
            suits[i + 39] = "Diamonds";
            points[i + 39] = 13 - i;
        }


	    Deck deck = new Deck(ranks, suits, points);

        System.out.println(deck.deal());
        System.out.println(deck);
        System.out.println();
        deck.shuffle();
        System.out.println(deck.toString());
	}
	
}
