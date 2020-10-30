package mastermind.controllers.players.codebrakers.user;

import java.util.ArrayList;
import java.util.List;

import mastermind.models.Board;
import mastermind.models.BoardRegistry;
import mastermind.views.ViewObserver;

public class UserControllerFactory {
	
	public static List<ViewObserver> getControllers(Board board, BoardRegistry registry) {
		List<ViewObserver> controllers = new ArrayList<ViewObserver>();
		controllers.add(new CodeBreakerGuessController(board, registry));
		controllers.add(new CodeBreakerRedoController(board, registry));
		controllers.add(new CodeBreakerUndoController(board, registry));
		return controllers;
	}
}
