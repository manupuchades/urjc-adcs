package mastermind.controllers;

import mastermind.controllers.players.CodeBreakerController;
import mastermind.controllers.players.CodeBreakerRandomController;
import mastermind.controllers.players.CodeBreakerUserController;
import mastermind.controllers.players.CodeMakerController;
import mastermind.controllers.players.CodeMakerRandomController;
import mastermind.controllers.players.CodeMakerUserController;
import mastermind.models.Board;
import mastermind.views.SelectUserCodeBreakerView;
import mastermind.views.SelectUserCodeMakerView;

public class PlayersFactory {

	public static CodeBreakerController getCodeBreaker(Board board) {
		if(SelectUserCodeBreakerView.read()) {
			return new CodeBreakerUserController(board);
		}else {
			return new CodeBreakerRandomController(board);
		}
	}
	
	public static CodeMakerController getCodeMaker(Board board) {
		if(SelectUserCodeMakerView.read()) {
			return new CodeMakerUserController(board);
		}else {
			return new CodeMakerRandomController(board);
		}
	}
}
