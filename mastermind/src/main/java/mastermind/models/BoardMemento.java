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
	
	void write() {
		System.out.println(">>>>>> BOARD MEMENTO");
		for (int i = 0; i < guesses.size(); i++) {
			System.out.println("feedback : " + feedbacks.get(i).write() + " | guess : " + guesses.get(i).write()  );
		}
	}
}
