package mastermind.controllers.players.codebrakers;

import mastermind.models.Board;

public abstract class CodeBreakerController {

	protected Board board;

	public CodeBreakerController(Board board) {
		this.board = board;
	}

	public abstract void play(); 
}
