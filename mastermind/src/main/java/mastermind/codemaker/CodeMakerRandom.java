package mastermind.codemaker;

import mastermind.board.Board;
import mastermind.board.Code;

public class CodeMakerRandom extends CodeMaker {

	public CodeMakerRandom(Board board) {
		super(board);
	}

	@Override
	Code createSecret() {
		// TODO Auto-generated method stub
		return new Code();
	}

}
