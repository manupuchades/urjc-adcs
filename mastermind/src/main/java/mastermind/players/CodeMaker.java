package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.views.GameOverView;
import mastermind.views.WinnerView;

public class CodeMaker {
	private Board board;

	public CodeMaker(Board board) {
		this.board = board;
		board.setSecret(createSecret());
	}

	public boolean provideFeedback() {
		if (board.isBoardComplete()) {
			GameOverView.write();
			return false;
		} else if (board.isWinner()) {
			WinnerView.write();
			return false;
		} else {
			return true;
		}
	}

	public Code createSecret() {
		return Code.getRandomCode();
	}
}
