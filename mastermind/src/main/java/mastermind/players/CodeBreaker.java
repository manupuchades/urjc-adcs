package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.views.EnterCodeView;

public abstract class CodeBreaker {

	protected Board board;

	public CodeBreaker(Board board) {
		this.board = board;
	}

	public abstract void makeGuess(); 
}
