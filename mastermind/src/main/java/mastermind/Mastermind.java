package mastermind;

import mastermind.board.Board;
import mastermind.players.CodeBreaker;
import mastermind.players.CodeMaker;
import mastermind.ui.Dialog;

public class Mastermind {

	private Board board;
	private CodeMaker codeMaker;
	private CodeBreaker codeBreaker;
	
	Mastermind(){
		this.board = new Board();
		this.codeMaker = new CodeMaker(this.board);
		this.codeBreaker = new CodeBreaker(this.board);
	}

	public static void main(String[] args) {
		do {
			new Mastermind().play();
		} while (Dialog.continueGame());
	}

	private void play() {
		do {
			this.board.write();
			this.codeBreaker.makeGuess();
		} while (this.codeMaker.provideFeedback());
	}
}
