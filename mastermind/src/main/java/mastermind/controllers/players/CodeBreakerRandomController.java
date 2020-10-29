package mastermind.controllers.players;

import mastermind.models.Board;
import mastermind.models.Code;

public class CodeBreakerRandomController extends CodeBreakerController{
	
	public CodeBreakerRandomController(Board board) {
		super(board);
	}

	public void play() {
		sleepOneSecond();
		this.board.add(Code.getRandomCode());
	}
	
	private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
	}
}
