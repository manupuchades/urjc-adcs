package mastermind.controllers.players.codebrakers.user;

import org.apache.commons.lang3.StringUtils;

import mastermind.models.Board;
import mastermind.models.BoardRegistry;
import mastermind.views.console.writers.ErrorView;

public class CodeBreakerUndoController extends UserController {

	private static final String UNDO_COMMAND = "U";

	CodeBreakerUndoController(Board board, BoardRegistry registry) {
		super(board, registry);
	}

	void play(String input) {
		this.board.update(this.registry.undo());
	}

	boolean isValid(String input) {
		return StringUtils.equals(input, UNDO_COMMAND);
	}

	boolean isPossible() {
		if (!this.registry.isUndoPossible()) {
			ErrorView.write();
			return false;
		}
		return true;
	}
}
