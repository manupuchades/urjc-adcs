package mastermind;

import mastermind.controllers.GameController;
import mastermind.controllers.PlayersFactory;
import mastermind.controllers.players.CodeBreakerController;
import mastermind.controllers.players.CodeMakerController;

public class Mastermind {

	private GameController game;
	private CodeMakerController codeMaker;
	private CodeBreakerController codeBreaker;
	
	Mastermind(){
		this.game = new GameController();
		this.codeMaker = PlayersFactory.getCodeMaker(this.game.getBoard(), this.game.readCodeMakerType());
		this.codeBreaker = PlayersFactory.getCodeBreaker(this.game.getBoard(), this.game.readCodeBreakerType());
	}

	public static void main(String[] args) {
		do {
			new Mastermind().play();
		} while (GameController.resume());
	}

	private void play() {
		do {
			this.codeBreaker.makeGuess();
			this.game.write();
		} while (this.codeMaker.continueGame());
	}
}
