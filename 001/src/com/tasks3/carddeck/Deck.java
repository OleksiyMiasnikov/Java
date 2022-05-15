package com.tasks3.carddeck;

import com.tasks3.carddeck.Rank.Ranks;
import com.tasks3.carddeck.Suit.Suits;

public class Deck {
	
	public Card[] deck36 = new Card[36];
    
	public Deck() {
	//+
		this.order();
	}
	
	//Перемішує колоду у випадковому порядку 
    public void shuffle() {
    	int decklength = 36;
    	int c;
    	Card buf;
    	for ( decklength = 0; (decklength < 36 && deck36[decklength] != null); decklength++) {
    	}
    	for (int i = 0; i < decklength; i++) {
    		c = (int) (Math.random()*(decklength-i));
    		buf = deck36[c+i];
    		deck36[c+i] = deck36[i];
    		deck36[i] = buf;   		
    	}
    }
    
    /* * Впорядкування колоди за мастями та значеннями 
    * Порядок сотрування: 
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES 
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 
    * Наприклад 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
    //+
    	int i = 0, r, s;
    	Ranks rArray[] = Ranks.values();
    	Suits sArray[] = Suits.values();
    	for (s = 0; s < sArray.length; s++) {
			for (r = 0; r < rArray.length; r++) {
				//deck36[i].setSuit(Suit.values[s]);
				//deck36[i].setRank(Rank.values[r]);
				deck36[i] = new Card(rArray[r], sArray[s]);
				i ++;
			}
		}	
    }
    
    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
    //+
    	if (deck36[0] != null) {
    		return true;
    	} else return false;
    	
    }
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
    //+
    	Card c;
    	int i;
    	for (i = 35; (i >= 0 && deck36[i] == null); i--) {}
    	if (i >= 0) {
    		c = deck36[i];
    		deck36[i] = null;
    	} else {
    		c = null;
    	}
    	return c;
    } 
   
    
    public void printDeck() {
    //+
    	for (int i = 0; (i < 36 && deck36[i] != null ); i ++) {
    		System.out.println(deck36[i].getRank().name() + " " + deck36[i].getSuit().name());
    	}
    } 
    
}
