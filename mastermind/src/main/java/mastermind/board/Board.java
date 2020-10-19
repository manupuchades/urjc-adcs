package mastermind.board;

import java.util.ArrayList;
import java.util.List;

import mastermind.views.BoardView;

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

	public void write() {
		BoardView.write(BOARD_SIZE, guesses, feedbacks);
	}

	public void add(Code guess) {
		guesses.add(guess);
		add(new Key(secret, guess));
	}

	private void add(Key feedback) {
		feedbacks.add(feedback);
	}

	public boolean isWinner() {
		return feedbacks.get(feedbacks.size() - 1).isWinner();
	}

	public boolean isBoardComplete() {
		return guesses.size() >= (BOARD_SIZE);
	}
}
