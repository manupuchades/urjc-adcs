package mastermind.codemaker;

import mastermind.board.Board;
import mastermind.board.Code;

public abstract class CodeMaker {
	private Board board;
	
	public CodeMaker (Board board){
		this.board = board;
		board = new Board (createSecret());
	}

	public boolean provideFeedback() {
		return false;
	}
	
	abstract Code createSecret();
}
