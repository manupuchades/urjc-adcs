package mastermind.controllers;

import mastermind.models.Board;
import mastermind.views.SelectUserCodeMakerView;

public class CodeMakerFactory {

	public static CodeMaker getCodeMaker(Board board) {
		if(SelectUserCodeMakerView.read()) {
			return new CodeMakerUser(board);
		}else {
			return new CodeMakerRandom(board);
		}
	}
}
