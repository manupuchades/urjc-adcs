package mastermind.controllers;

import mastermind.models.Board;
import mastermind.views.BoardView;
import mastermind.views.ContinueView;
import mastermind.views.WelcomeView;

public class GameController {

	private Board board;

	public GameController() {
		WelcomeView.write();
		this.board = new Board();
	}
	
	public void write() {
		BoardView.write(Board.getBoardSize(), board.getGuesses(), board.getFeedbacks());
	}
	
	public Board getBoard() {
		return this.board;
	}
	
	public static boolean continueGame() {
		return ContinueView.read();
	}
	
}
