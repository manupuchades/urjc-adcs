package mastermind.controllers.players.codemakers.machine;

import mastermind.controllers.players.codemakers.CodeMakerController;
import mastermind.models.Board;
import mastermind.models.Code;

public class CodeMakerRandomController extends CodeMakerController{

	public CodeMakerRandomController(Board board) {
		super(board);
	}

	public Code createSecret() {
		return Code.getRandomCode();
	}
}
