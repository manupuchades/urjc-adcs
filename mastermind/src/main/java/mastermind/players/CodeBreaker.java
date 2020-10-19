package mastermind.players;

import mastermind.board.Board;
import mastermind.board.Code;
import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class CodeBreaker {

	private Board board;

	public CodeBreaker(Board board) {
		this.board = board;
		
		Dialog.write(Message.TITLE);
	}

	public void makeGuess() {
		Code guess = new Code(Dialog.read(Code.codeValidator, Message.ENTER_PATTERN_CODE, Message.ERROR_INVALID_INPUT));
		this.board.add(guess);
	}
}
