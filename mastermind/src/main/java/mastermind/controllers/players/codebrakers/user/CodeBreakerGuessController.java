package mastermind.controllers.players.codebrakers.user;

import mastermind.models.Code;
import mastermind.models.Session;

public class CodeBreakerGuessController extends UserController {

	CodeBreakerGuessController(Session session) {
		super(session);
	}

	void play(String input) {
		this.session.getBoard().add(new Code(input));
		session.getRegistry().save(session.getBoard());
	}

	boolean isValid(String input) {
		return input.length() == Code.CODE_SIZE;
	}

	boolean isPossible() {
		return true;
	}
}
