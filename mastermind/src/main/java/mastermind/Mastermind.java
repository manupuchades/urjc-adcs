package mastermind;

import mastermind.board.Board;
import mastermind.players.CodeBreaker;
import mastermind.players.CodeMaker;
import mastermind.players.CodeMakerFactory;
import mastermind.ui.Dialog;
import mastermind.views.ContinueView;

public class Mastermind {

	private Board board;
	private CodeMaker codeMaker;
	private CodeBreaker codeBreaker;
	
	Mastermind(){
		this.board = new Board();
		this.codeMaker = CodeMakerFactory.getCodeMaker(this.board);
		this.codeBreaker = new CodeBreaker(this.board);
	}

	public static void main(String[] args) {
		do {
			new Mastermind().play();
		} while (continueGame());
	}

	private void play() {
		do {
			this.board.write();
			this.codeBreaker.makeGuess();
		} while (this.codeMaker.provideFeedback());
	}
	
	private static boolean continueGame() {
		return ContinueView.read();
	}
}
