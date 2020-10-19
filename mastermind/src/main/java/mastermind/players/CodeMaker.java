package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class CodeMaker {
	private Board board;

	public CodeMaker(Board board) {
		this.board = board;
		board.setSecret(createSecret());
	}

	public boolean provideFeedback() {
		if (board.isBoardComplete()) {
			Dialog.write(Message.FEEDBACK_GAMEOVER);
			return false;
		} else if (board.isWinner()) {
			Dialog.write(Message.FEEDBACK_YOU_WIN);
			return false;
		} else {
			return true;
		}
	}

	public Code createSecret() {
		return Code.getRandomCode();
	}
}
