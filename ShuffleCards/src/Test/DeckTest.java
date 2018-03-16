package Test;

import org.junit.Test;

import cards.Deck;
import junit.framework.Assert;

public class DeckTest {

	
	      Deck deck = new Deck();
	@Test
	public void createDeckOfCards(){
		
		//test if we have all 52 cards in this deck
		
		Assert.assertTrue((deck.isEmpty()==false));
		Assert.assertEquals(52,deck.getDeckSize());
	}
	
	
	@Test
	public void removeCardFromDeck(){
		
		//check if we are able to draw a card from the deck
		deck.drawRandomCard();
		Assert.assertEquals(51,deck.getDeckSize());
		
	}
	
	
}
