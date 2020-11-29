package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	private List<BoardObserver> observers;

	private Code secret;

	private static final Integer BOARD_SIZE = 10;

	private List<Code> guesses;
	private List<Key> feedbacks;

	public Board() {
		this.guesses = new ArrayList<Code>();
		this.feedbacks = new ArrayList<Key>();
		this.observers = new ArrayList<BoardObserver>();
	}

	public void setSecret(Code secret) {
		this.secret = secret;
	}

	public void add(Code guess) {
		this.guesses.add(guess);
		add(new Key(secret, guess));
		notifyObservers();
	}

	private void add(Key feedback) {
		this.feedbacks.add(feedback);
	}

	public boolean isWinner() {
		return !feedbacks.isEmpty() && feedbacks.get(feedbacks.size() - 1).isAllBlack();
	}

	public boolean isBoardComplete() {
		return guesses.size() >= (BOARD_SIZE);
	}

	public static Integer getBoardSize() {
		return BOARD_SIZE;
	}

	public List<String> getPrintableGuesses() {
		List<String> printableGuesses = new ArrayList<String>();
		for (Code c : this.guesses) {
			printableGuesses.add(c.write());
		}
		return printableGuesses;
	}

	public List<String> getPrintableFeedbacks() {
		List<String> printableFeedbacks = new ArrayList<String>();
		for (Key k : this.feedbacks) {
			printableFeedbacks.add(k.write());
		}
		return printableFeedbacks;
	}
	
	public void update(BoardMemento memento) {
		this.guesses = new ArrayList<Code>(memento.getGuesses());
		this.feedbacks = new ArrayList<Key>(memento.getFeedbacks());
		notifyObservers();
	}
	
	public void addObserver(BoardObserver observer) {
		observers.add(observer);
	}
	
	private void notifyObservers() {
		for(BoardObserver observer: observers) {
			observer.refresh();
		}
	}

	public List<Code> getGuesses() {
		return guesses;
	}

	public void setGuesses(List<Code> guesses) {
		this.guesses = guesses;
	}

	public List<Key> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Key> feedbacks) {
		this.feedbacks = feedbacks;
	}
}
