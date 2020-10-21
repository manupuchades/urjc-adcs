package mastermind.controllers;

import org.apache.commons.lang3.StringUtils;

import mastermind.controllers.players.CodeBreakerController;
import mastermind.controllers.players.CodeBreakerRandomController;
import mastermind.controllers.players.CodeBreakerUserController;
import mastermind.controllers.players.CodeMakerController;
import mastermind.controllers.players.CodeMakerRandomController;
import mastermind.controllers.players.CodeMakerUserController;
import mastermind.models.Board;

public class PlayersFactory {
	
	private static final String USER_TYPE = "U"; 

	public static CodeBreakerController getCodeBreaker(Board board, String type) {
		if(StringUtils.equalsIgnoreCase(USER_TYPE, type)) {
			return new CodeBreakerUserController(board);
		}else {
			return new CodeBreakerRandomController(board);
		}
	}
	
	public static CodeMakerController getCodeMaker(Board board, String type) {
		if(StringUtils.equalsIgnoreCase(USER_TYPE, type)) {
			return new CodeMakerUserController(board);
		}else {
			return new CodeMakerRandomController(board);
		}
	}
}
