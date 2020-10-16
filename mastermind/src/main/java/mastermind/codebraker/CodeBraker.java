package mastermind.codebraker;

import mastermind.board.Board;

public abstract class CodeBraker {
	
	private Board board;
	
	public CodeBraker (Board board){
		this.board = board;
	}
	
	public abstract void makeGuess();

}
