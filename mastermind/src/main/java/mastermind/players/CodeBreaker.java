package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.views.EnterCodeView;

public class CodeBreaker {

	private Board board;

	public CodeBreaker(Board board) {
		this.board = board;
	}

	public void makeGuess() {
		Code guess = new Code(EnterCodeView.read());
		this.board.add(guess);
	}
}
