package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.EnterCodeView;

public class CodeBreakerUser extends CodeBreaker{

	public CodeBreakerUser(Board board) {
		super(board);
	}

	public void makeGuess() {
		Code guess = new Code(EnterCodeView.read());
		this.board.add(guess);
	}
}
