package io.robusta.hand.solution;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeckGenerator;

public class DeckGenerator implements IDeckGenerator {

	@Override
	public Deck generate() {
		Deck deck = new Deck();

		
		// fill the deck with cards
        // Probably use the good modulo
		for (int i = 0; i < 52; i++) {
		Card card= generateCard(i);
		deck.add(card);

		}
		System.out.println(deck);
		return deck;
	}

}
