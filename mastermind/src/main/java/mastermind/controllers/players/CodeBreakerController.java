package mastermind.controllers.players;

import mastermind.models.Board;

public abstract class CodeBreakerController {

	protected Board board;

	public CodeBreakerController(Board board) {
		this.board = board;
	}

	public abstract void makeGuess(); 
}
