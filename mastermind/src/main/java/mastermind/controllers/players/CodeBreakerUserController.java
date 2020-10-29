package mastermind.controllers.players;

import mastermind.models.Board;
import mastermind.models.BoardRegistry;
import mastermind.models.Code;
import mastermind.views.EnterActionView;

public class CodeBreakerUserController extends CodeBreakerController {

	BoardRegistry registry;

	public CodeBreakerUserController(Board board) {
		super(board);
		registry = new BoardRegistry();
	}

	public void play() {
		String action = EnterActionView.read();

		if (action.length() == 4) {
			guess(action);
		} else if (action.equals("U")) {
			undo();
		} else {
			redo();
		}
	}

	private void guess(String code) {
		this.board.add(new Code(code));
		registry.save(board);
	}

	private void undo() {
		if(this.registry.isUndoPossible()) {
			this.board.update(this.registry.undo());
		} else {
			EnterActionView.invalidInput();
			this.play();
		}
	}

	private void redo() {
		if (this.registry.isRedoPossible()) {
			this.board.update(this.registry.redo());
		} else {
			EnterActionView.invalidInput();
			this.play();
		}
	}
}
