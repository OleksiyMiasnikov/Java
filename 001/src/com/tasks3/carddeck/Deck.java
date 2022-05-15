package com.tasks3.carddeck;

import com.tasks3.carddeck.Rank.Ranks;
import com.tasks3.carddeck.Suit.Suits;

public class Deck {
	
	public Card[] deck36 = new Card[36];
    
	public Deck() {
	//+
		this.order();
	}
	
	//������� ������ � ����������� ������� 
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
    
    /* * ������������� ������ �� ������� �� ���������� 
    * ������� ����������: 
    * �������� �� ����� � ����� HEARTS, ���� DIAMONDS, CLUBS, SPADES 
    * ��� ����� ���� ������� ���������: Ace,King,Queen,Jack,10,9,8,7,6 
    * ��������� 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * � ��� ��� ��� DIAMONDS, CLUBS, SPADES */
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
    
    //������� true � ������� ���� � ����� �� ������� �����
    public boolean hasNext() {
    //+
    	if (deck36[0] != null) {
    		return true;
    	} else return false;
    	
    }
    
    //"�����" ���� ����� � ������, ���� ���� ������ �� 36 ���� ������� null
    //����� ���������� � "�������" ������. ��������� ������ ������ ������� SPADES 6 ����
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace � ��� ��� �� HEARTS Ace
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
