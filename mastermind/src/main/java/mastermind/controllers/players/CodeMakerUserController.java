package mastermind.controllers.players;

import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.EnterSecretCodeView;

public class CodeMakerUserController extends CodeMakerController{

	public CodeMakerUserController(Board board) {
		super(board);
	}

	public Code createSecret() {
		return new Code(EnterSecretCodeView.read());
	}
}
