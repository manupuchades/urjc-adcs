package mastermind;

import mastermind.controllers.CodeBreaker;
import mastermind.controllers.CodeBreakerFactory;
import mastermind.controllers.CodeMaker;
import mastermind.controllers.CodeMakerFactory;
import mastermind.controllers.GameController;

public class Mastermind {

	private GameController game;
	private CodeMaker codeMaker;
	private CodeBreaker codeBreaker;
	
	Mastermind(){
		this.game = new GameController();
		this.codeMaker = CodeMakerFactory.getCodeMaker(this.game.getBoard());
		this.codeBreaker = CodeBreakerFactory.getCodeBreaker(this.game.getBoard());
	}

	public static void main(String[] args) {
		do {
			new Mastermind().play();
		} while (GameController.continueGame());
	}

	private void play() {
		do {
			this.game.write();
			this.codeBreaker.makeGuess();
		} while (this.codeMaker.provideFeedback());
	}
}
