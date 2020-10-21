package mastermind.players;

import mastermind.board.Board;
import mastermind.views.SelectUserCodeBreakerView;

public class CodeBreakerFactory {

	public static CodeBreaker getCodeBreaker(Board board) {
		if(SelectUserCodeBreakerView.read()) {
			return new CodeBreakerUser(board);
		}else {
			return new CodeBreakerRandom(board);
		}
	}
}
