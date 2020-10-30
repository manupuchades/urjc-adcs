package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class BoardMemento {

	private List<Code> guesses;

	private List<Key> feedbacks;

	public BoardMemento(Board b) {
		this.guesses = new ArrayList<Code>(b.getGuesses());
		this.feedbacks = new ArrayList<Key>(b.getFeedbacks());
	}

	public List<Code> getGuesses() {
		return guesses;
	}

	public List<Key> getFeedbacks() {
		return feedbacks;
	}
}
