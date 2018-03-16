package cards;

public class CardDealer {

	public static void main(String[] args) {	
		Deck deck = new Deck();
		//deck.displayDeck();
		deck.drawRandomCard();
		deck.drawRandomCard();
		deck.shuffle();
		System.out.println(deck.getDeckSize());

		
		
	}

}
