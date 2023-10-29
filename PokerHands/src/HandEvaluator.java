import java.util.ArrayList;
import java.util.Random;

public class HandEvaluator {
	ArrayList<Card> hand;
	ArrayList<Card> deck;
	ArrayList<Card> fullDeck;
	//number of cards drawn per hand
	static final int num_cards = 5;
	//number of hands drawn in total
	static final int hands = 10000;
	//0 = Spades, 1 = Clubs, 2 = Hearts, 3 = Diamonds 
	//2-10 normal, then Jack = 11, Queen = 12, King = 13, Ace = 14
	public HandEvaluator() {
		for (int i=0; i<13; i++) {
			Card c = new Card(0,2+i);
			deck.add(c);
		}
		for (int i=0; i<13; i++) {
			Card c = new Card(1,2+i);
			deck.add(c);
		}
		for (int i=0; i<13; i++) {
			Card c = new Card(2,2+i);
			deck.add(c);
		}
		for (int i=0; i<13; i++) {
			Card c = new Card(3,2+i);
			deck.add(c);
		}
		//populate the deck
		//4 loops. one of each suit, use new Card(suit value)
		//add to deck
		fullDeck = deck;
	}

	public void drawCard(int n) {
		Random rand = new Random();
		for(int i=0; i<n; i++) {	
			//take a random card from deck
			int nextCard = rand.nextInt(52);
			//add to array hand
			hand.add(deck.get(nextCard));
			//remove card from deck
			deck.remove(nextCard);
			
		}
		deck = fullDeck;
	}
	
	public void drawHand() {
		drawCard(num_cards);
	}
	
	public void dealer() {
		for(int i=0; i<hands; i++) {
			drawHand();
		}
	}
	
	public int Pair_Evaluator() {
		//evaluate for a pair
		int pair_count = 0;
		for(int i=0; i<num_cards; i++) {
			for(int j=1; j<num_cards-1; j++) {
				if(hand.get(i)==hand.get(j)) {
					pair_count++;
				}
			}
			hand.remove(i);
		}
		return pair_count;
	}

	public static void main(String[] args) {
		
		}
	
}
