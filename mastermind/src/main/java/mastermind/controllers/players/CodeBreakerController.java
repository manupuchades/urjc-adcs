package mastermind.controllers.players;

import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.EnterCodeView;

public abstract class CodeBreakerController {

	protected Board board;

	public CodeBreakerController(Board board) {
		this.board = board;
	}

	public abstract void makeGuess(); 
}
