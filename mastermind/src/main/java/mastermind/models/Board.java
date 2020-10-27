package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private Code secret;

	private static final Integer BOARD_SIZE = 10;

	private List<Code> guesses;

	private List<Key> feedbacks;

	public Board() {
		guesses = new ArrayList<Code>();
		feedbacks = new ArrayList<Key>();
	}

	public void setSecret(Code secret) {
		this.secret = secret;
	}

	public void add(Code guess) {
		guesses.add(guess);
		add(new Key(secret, guess));
	}

	private void add(Key feedback) {
		feedbacks.add(feedback);
	}

	public boolean isWinner() {
		return feedbacks.get(feedbacks.size() - 1).isAllBlack();
	}

	public boolean isBoardComplete() {
		return guesses.size() >= (BOARD_SIZE);
	}

	public static Integer getBoardSize() {
		return BOARD_SIZE;
	}

	public List<String> getGuesses() {
		List<String> writeGuesses = new ArrayList<String>();
		for (Code c : this.guesses) {
			writeGuesses.add(c.write());
		}
		return writeGuesses;
	}

	public List<String> getFeedbacks() {
		List<String> writeFeedbacks = new ArrayList<String>();
		for (Key k : this.feedbacks) {
			writeFeedbacks.add(k.write());
		}
		return writeFeedbacks;
	}
}
