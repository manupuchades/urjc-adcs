package mastermind.codemaker;

import mastermind.board.Board;
import mastermind.board.Code;

public class CodeMakerUser extends CodeMaker {

	public CodeMakerUser(Board board) {
		super(board);
	}

	@Override
	Code createSecret() {
		// TODO Auto-generated method stub
		return new Code();
	}

}
