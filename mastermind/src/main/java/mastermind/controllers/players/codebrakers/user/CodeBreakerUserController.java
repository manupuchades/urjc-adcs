package mastermind.controllers.players.codebrakers.user;

import mastermind.controllers.players.codebrakers.CodeBreakerController;
import mastermind.models.Board;
import mastermind.models.BoardRegistry;
import mastermind.views.console.readers.EnterActionView;

public class CodeBreakerUserController extends CodeBreakerController {

	BoardRegistry registry;

	public CodeBreakerUserController(Board board) {
		super(board);
		registry = new BoardRegistry();
	}

	public void play() {
		new EnterActionView(UserControllerFactory.getControllers(this.board, this.registry)).read();
	}
}
