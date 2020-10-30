package mastermind.controllers.players.codebrakers.user;

import mastermind.models.Board;
import mastermind.models.BoardRegistry;
import mastermind.models.Code;

public class CodeBreakerGuessController extends UserController {

	CodeBreakerGuessController(Board board, BoardRegistry registry) {
		super(board, registry);
	}

	void play(String input) {
		this.board.add(new Code(input));
		registry.save(board);
	}

	boolean isValid(String input) {
		return input.length() == Code.CODE_SIZE;
	}

	boolean isPossible() {
		return true;
	}
}
