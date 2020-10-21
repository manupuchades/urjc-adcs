package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.EnterSecretCodeView;

public class CodeMakerUser extends CodeMaker{

	public CodeMakerUser(Board board) {
		super(board);
	}

	public Code createSecret() {
		return new Code(EnterSecretCodeView.read());
	}
}
