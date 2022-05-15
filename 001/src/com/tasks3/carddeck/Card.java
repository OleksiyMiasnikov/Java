package com.tasks3.carddeck;

public class Card {
	private Rank.Ranks rank;
	private Suit.Suits suit;

	public Card(Rank.Ranks rank, Suit.Suits suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank.Ranks getRank() {
		return rank;
	}

	public void setRank(Rank.Ranks rank) {
		this.rank = rank;
	}

	public Suit.Suits getSuit() {
		return suit;
	}

	public void setSuit(Suit.Suits suit) {
		this.suit = suit;
	}
}
