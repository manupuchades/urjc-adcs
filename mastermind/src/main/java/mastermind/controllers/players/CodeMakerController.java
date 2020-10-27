package mastermind.controllers.players;

import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.GameOverView;
import mastermind.views.WinnerView;

public abstract class CodeMakerController {
	private Board board;

	public CodeMakerController(Board board) {
		this.board = board;
		board.setSecret(createSecret());
	}

	public boolean continueGame() {
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
