package mastermind.board;

import java.util.List;

import mastermind.ui.Dialog;

public class Board {
	
	private Code secret;
	
	private static final Integer BOARD_SIZE = 10;
		
	private List<Code> guesses;
	
	private List<Key> feedbacks;
	
	public Board(Code secret) {
		this.secret = secret;
	}
	
	public void write() {
		Dialog.writeBoard(BOARD_SIZE, guesses, feedbacks);
	}
	
	public void add(Code guess) {
		guesses.add(guess);
	}
	
	public void add(Key feedback) {
		feedbacks.add(feedback);
	}
	
	public boolean checkLastCode() {
		
		return false;
	}
	
	public boolean isBoardComplete() {
		return guesses.size() >= (BOARD_SIZE);
	}
}
