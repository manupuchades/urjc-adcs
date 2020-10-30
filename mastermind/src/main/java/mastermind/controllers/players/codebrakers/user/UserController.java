package mastermind.controllers.players.codebrakers.user;

import mastermind.models.Board;
import mastermind.models.BoardRegistry;
import mastermind.views.ViewObserver;

public abstract class UserController implements ViewObserver {
	Board board;
	BoardRegistry registry;

	UserController(Board board, BoardRegistry registry) {
		this.board = board;
		this.registry = registry;
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
