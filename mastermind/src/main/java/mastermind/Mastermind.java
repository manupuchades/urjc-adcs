package mastermind;

import mastermind.controllers.CodeBreaker;
import mastermind.controllers.CodeBreakerFactory;
import mastermind.controllers.CodeMaker;
import mastermind.controllers.CodeMakerFactory;
import mastermind.models.Board;
import mastermind.views.ContinueView;

public class Mastermind {

	private Board board;
	private CodeMaker codeMaker;
	private CodeBreaker codeBreaker;
	
	Mastermind(){
		this.board = new Board();
		this.codeMaker = CodeMakerFactory.getCodeMaker(this.board);
		this.codeBreaker = CodeBreakerFactory.getCodeBreaker(this.board);
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
