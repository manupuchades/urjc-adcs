package mastermind.codebraker;

import mastermind.board.Board;

public class CodeBrakerFactory {
	public static CodeBraker getCodeBraker(Board board) {
		return new CodeBrakerUser(board);
	}
}
