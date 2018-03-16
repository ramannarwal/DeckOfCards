package cards;

import cards.Deck.Rank;
import cards.Deck.Suit;

public class Card {

    private Suit mSuit;
    private Rank mRank;

    public Card(Suit suit, Rank rank) {
        this.mSuit = suit;
        this.mRank = rank;
    }

    public Suit getSuit() {
        return mSuit;
    }

    public Rank getRank() {
        return mRank;
    }

    
	@Override
	public String toString() {
		return  mRank + " of " + mSuit;
	}
		

    

}
