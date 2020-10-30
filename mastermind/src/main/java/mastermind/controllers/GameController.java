package mastermind.controllers;

import mastermind.models.Board;
import mastermind.views.console.readers.ResumeView;
import mastermind.views.console.readers.SelectUserCodeBreakerView;
import mastermind.views.console.readers.SelectUserCodeMakerView;
import mastermind.views.console.writers.BoardView;
import mastermind.views.console.writers.WelcomeView;

public class GameController {

	private Board board;

	public GameController() {
		WelcomeView.write();
		this.board = new Board();
	}
	
	public void write() {
		BoardView.write(Board.getBoardSize(), board.getPrintableGuesses(), board.getPrintableFeedbacks());
	}
	
	public String readCodeBreakerType() {
		return SelectUserCodeBreakerView.read();
	}
	
	public String readCodeMakerType() {
		return SelectUserCodeMakerView.read();
	}
	
	public static boolean resume() {
		return ResumeView.read();
	}
	
	public Board getBoard() {
		return this.board;
	}
}
