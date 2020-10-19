package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.views.EnterCodeView;
import mastermind.views.WelcomeView;

public class CodeBreaker {

	private Board board;

	public CodeBreaker(Board board) {
		this.board = board;
		
		WelcomeView.write();
	}

	public void makeGuess() {
		Code guess = new Code(EnterCodeView.read());
		this.board.add(guess);
	}
}
