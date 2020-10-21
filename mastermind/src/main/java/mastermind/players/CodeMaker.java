package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.views.GameOverView;
import mastermind.views.WinnerView;

public abstract class CodeMaker {
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

	public abstract Code createSecret();
}
