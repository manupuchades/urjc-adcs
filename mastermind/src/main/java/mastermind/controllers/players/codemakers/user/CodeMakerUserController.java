package mastermind.controllers.players.codemakers.user;

import mastermind.controllers.players.codemakers.CodeMakerController;
import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.console.readers.EnterSecretCodeView;

public class CodeMakerUserController extends CodeMakerController{

	public CodeMakerUserController(Board board) {
		super(board);
	}

	public Code createSecret() {
		return new Code(EnterSecretCodeView.read());
	}
}
