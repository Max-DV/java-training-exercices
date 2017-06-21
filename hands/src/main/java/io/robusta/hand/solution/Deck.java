package io.robusta.hand.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck {

	private static final long serialVersionUID = -4686285366508321800L;

	public Deck() {

	}

	@Override
	public Card pick() {
		// List<Card> deck;
		// Random randomCards=new Random();
		Collections.shuffle(this);

		return this.removeFirst();
	}

	@Override
	public TreeSet<Card> pick(int number) {
		TreeSet<Card> treeset = new TreeSet<>();
		for (int i = 0; i < number; i++) {
		
			treeset.add(pick());

		}

		return treeset;
	}

	@Override
	public Hand giveHand() {
		Hand hand = new Hand();
		hand.addAll(pick(5));

		// A hand is a **5** card TreeSet
		return hand;
	}

}
