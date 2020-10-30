package mastermind.controllers.players;

import org.apache.commons.lang3.StringUtils;

import mastermind.controllers.players.codebrakers.CodeBreakerController;
import mastermind.controllers.players.codebrakers.machine.CodeBreakerRandomController;
import mastermind.controllers.players.codebrakers.user.CodeBreakerUserController;
import mastermind.controllers.players.codemakers.CodeMakerController;
import mastermind.controllers.players.codemakers.machine.CodeMakerRandomController;
import mastermind.controllers.players.codemakers.user.CodeMakerUserController;
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
