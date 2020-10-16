package mastermind.board;

import java.util.List;

public class Board {
	
	private Code secret;
	
	private List<Code> guesses;
	
	private List<Key> feedbacks;
	
	public Board(Code secret) {
		this.secret = secret;
	}
	
	public void write() {}
	
	public Code getSecretCode() {
		return secret;
	}
	
	public void add(Code guess) {
		guesses.add(guess);
	}
	
	public void add(Key feedback) {
		feedbacks.add(feedback);
	}

}
