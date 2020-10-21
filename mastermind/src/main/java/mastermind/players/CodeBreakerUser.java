package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.views.EnterCodeView;

public class CodeBreakerUser extends CodeBreaker{

	public CodeBreakerUser(Board board) {
		super(board);
	}

	public void makeGuess() {
		Code guess = new Code(EnterCodeView.read());
		this.board.add(guess);
	}
}
