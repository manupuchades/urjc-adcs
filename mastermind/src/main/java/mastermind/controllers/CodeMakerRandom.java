package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.Code;

public class CodeMakerRandom extends CodeMaker{

	public CodeMakerRandom(Board board) {
		super(board);
	}

	public Code createSecret() {
		return Code.getRandomCode();
	}
}
