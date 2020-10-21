package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.views.EnterSecretCodeView;

public class CodeMakerUser extends CodeMaker{

	public CodeMakerUser(Board board) {
		super(board);
	}

	public Code createSecret() {
		return new Code(EnterSecretCodeView.read());
	}
}
