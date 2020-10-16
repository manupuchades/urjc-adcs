package mastermind;

import mastermind.board.Board;
import mastermind.codebraker.CodeBraker;
import mastermind.codebraker.CodeBrakerFactory;
import mastermind.codemaker.CodeMaker;
import mastermind.codemaker.CodeMakerFactory;
import mastermind.ui.Dialog;

public class Mastermind {

	private Board board;
	private CodeMaker codeMaker;
	private CodeBraker codeBraker;
	
	Mastermind(){
		this.codeMaker = CodeMakerFactory.getCodeMaker(this.board);
		this.codeBraker = CodeBrakerFactory.getCodeBraker(this.board);
	}

	public static void main(String[] args) {
		do {
			new Mastermind().play();
		} while (Dialog.continueGame());
	}

	private void play() {
		do {
			this.board.write();
			this.codeBraker.makeGuess();
		} while (this.codeMaker.provideFeedback());
	}
}
