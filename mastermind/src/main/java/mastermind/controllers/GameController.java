package mastermind.controllers;

import mastermind.models.Board;
import mastermind.views.BoardView;
import mastermind.views.ResumeView;
import mastermind.views.SelectUserCodeBreakerView;
import mastermind.views.SelectUserCodeMakerView;
import mastermind.views.WelcomeView;

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
