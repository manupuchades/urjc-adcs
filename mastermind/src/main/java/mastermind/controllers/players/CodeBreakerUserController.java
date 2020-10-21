package mastermind.controllers.players;

import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.EnterCodeView;

public class CodeBreakerUserController extends CodeBreakerController{

	public CodeBreakerUserController(Board board) {
		super(board);
	}

	public void makeGuess() {
		Code guess = new Code(EnterCodeView.read());
		this.board.add(guess);
	}
}
