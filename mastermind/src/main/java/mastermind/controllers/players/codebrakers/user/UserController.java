package mastermind.controllers.players.codebrakers.user;

import mastermind.models.Session;
import mastermind.views.ViewObserver;

public abstract class UserController implements ViewObserver {
	Session session;

	UserController(Session session) {
		this.session = session;
	}

	public void receive(String input) {
		if (isValid(input) && isPossible()) {
			play(input);
		}
	}

	abstract void play(String input);

	abstract boolean isValid(String input);

	abstract boolean isPossible();
}
