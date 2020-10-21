package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;

public class CodeMakerRandom extends CodeMaker{

	public CodeMakerRandom(Board board) {
		super(board);
	}

	public Code createSecret() {
		return Code.getRandomCode();
	}
}
