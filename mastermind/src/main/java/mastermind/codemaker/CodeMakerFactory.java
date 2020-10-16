package mastermind.codemaker;

import mastermind.board.Board;

public class CodeMakerFactory {
	
	public static CodeMaker getCodeMaker(Board board) {
		return new CodeMakerUser(board);
	}
}
