package mastermind.controllers.players.codebrakers.user;

import org.apache.commons.lang3.StringUtils;

import mastermind.models.Session;
import mastermind.views.console.writers.ErrorView;

public class CodeBreakerRedoController extends UserController {

	private static final String REDO_COMMAND = "R";

	CodeBreakerRedoController(Session session) {
		super(session);
	}

	void play(String input) {
		this.session.getBoard().update(this.session.getRegistry().undo());
	}

	boolean isValid(String input) {
		return StringUtils.equals(input, REDO_COMMAND);
	}

	boolean isPossible() {
		if (!this.session.getRegistry().isRedoPossible()) {
			ErrorView.write();
			return false;
		}
		return true;
	}
}
