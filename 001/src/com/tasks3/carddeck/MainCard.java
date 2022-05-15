package com.tasks3.carddeck;

public class MainCard {

	public static void main(String[] args) {
		Card c;
		Deck d36 = new Deck ();
		d36.printDeck();
		for (int j = 0; j < 36; j ++) {
			c = d36.drawOne();
			System.out.println(" - " + c.getRank().name() + " " + c.getSuit().name() + " - ");
		}
		if (d36.hasNext()) {
			System.out.println("Есть картишки");
		} else {
			System.out.println("Нима");
		}
		d36.shuffle();
		d36.printDeck();
		
	}

}
