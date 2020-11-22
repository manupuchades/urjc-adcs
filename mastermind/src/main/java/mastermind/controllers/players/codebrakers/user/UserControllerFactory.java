package mastermind.controllers.players.codebrakers.user;

import java.util.ArrayList;
import java.util.List;

import mastermind.models.Session;
import mastermind.views.ViewObserver;

public class UserControllerFactory {

	public static List<ViewObserver> getControllers(Session session) {
		List<ViewObserver> controllers = new ArrayList<ViewObserver>();
		controllers.add(new CodeBreakerGuessController(session));
		controllers.add(new CodeBreakerRedoController(session));
		controllers.add(new CodeBreakerUndoController(session));
		return controllers;
	}
}
