package mastermind;

import mastermind.controllers.GameController;
import mastermind.controllers.players.PlayersFactory;
import mastermind.controllers.players.codebrakers.CodeBreakerController;
import mastermind.controllers.players.codemakers.CodeMakerController;

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
			this.codeBreaker.play();
			this.game.write();
		} while (this.codeMaker.continueGame());
	}
}
