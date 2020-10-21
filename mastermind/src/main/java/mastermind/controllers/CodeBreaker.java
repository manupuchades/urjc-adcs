package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.Code;
import mastermind.views.EnterCodeView;

public abstract class CodeBreaker {

	protected Board board;

	public CodeBreaker(Board board) {
		this.board = board;
	}

	public abstract void makeGuess(); 
}
