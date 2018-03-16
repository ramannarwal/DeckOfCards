package cards;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
    private ArrayList<Card> currentDeck;
    private ArrayList<Card> removedCards;
    private Random generateCard;

//Using Enum datatype because we want values to be constant and we iterate through them. 
public static enum Suit {
    SPADES, HEARTS,DIAMONDS,CLUBS;}

public static enum Rank {
    TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE;}


// Deck constructor will instantiate the whole deck. 
public Deck() {
	generateCard = new Random();
    removedCards = new ArrayList<Card>();  
    currentDeck = new ArrayList<Card>(Suit.values().length * Rank.values().length);
    shuffle();
}


/*
 * Generate all 52 cards and re-shuffle the deck
 * 
 */
public void shuffle() {
	removedCards.clear();
    currentDeck.clear();
    for (Suit s : Suit.values()) {
        for (Rank r : Rank.values()) {
            Card c = new Card(s, r); 
            currentDeck.add(c);
        }
    }
    System.out.println("Cards shuffled!");
}



//Returns a pseudo-random number between min and max, inclusive.
public int randInt(int min, int max) {
  // nextInt is normally exclusive of the top value,
  // so add 1 to make it inclusive
  int randomNum = generateCard.nextInt((max - min) + 1) + min;
  return randomNum;
}


public boolean isEmpty(){
  return currentDeck.isEmpty();
}

//removes card from current deck and storages it in removedCard's list.
public void drawRandomCard() {
    if (currentDeck.isEmpty())
        System.out.println("Deck is empty");

    Card drawnCard = currentDeck.remove(randInt(0, currentDeck.size() - 1));
    if (drawnCard != null)
    	removedCards.add(drawnCard);
    System.out.println("Card removed: " + drawnCard);
    System.out.println("Number of cards in the deck: "+currentDeck.size()+"\n");
}


public int getDeckSize(){
	return currentDeck.size();
}

//Displays all the cards in the current deck.
public void displayDeck(){
	System.out.println("List of cards in the deck\n");
	for(Card a: currentDeck){
		System.out.println(a);
	}
	System.out.println("Number of cards in the deck: "+currentDeck.size()+"\n");
	
}







}