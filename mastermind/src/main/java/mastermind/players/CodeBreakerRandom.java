package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;

public class CodeBreakerRandom extends CodeBreaker{
	
	public CodeBreakerRandom(Board board) {
		super(board);
	}

	public void makeGuess() {
		sleepOneSecond();
		this.board.add(Code.getRandomCode());
	}
	
	private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
	}
}
