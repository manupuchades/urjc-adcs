package mastermind.views.console.writers;

import java.util.List;

import mastermind.models.Board;
import mastermind.models.BoardObserver;
import mastermind.views.console.ConsoleFormat;
import mastermind.views.console.Dialog;

public class BoardView implements BoardObserver {

	private Board board;

	public BoardView(Board board) {
		this.board = board;
	}

	private void write(int size, List<String> guesses, List<String> feedbacks) {
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		for (int i = 0; i < size; i++) {
			if (guesses != null && guesses.size() > i) {
				Dialog.write(formatter(guesses.get(i)).concat(ConsoleFormat.BOARD_SEPARATOR.getMessage())
						.concat(formatter(feedbacks.get(i))));
			} else {
				Dialog.write(ConsoleFormat.LINE_EMPTY);
			}
		}
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
	}

	private String formatter(String input) {
		String output = "| ";

		for (char c : input.toCharArray()) {
			output = output.concat(String.valueOf(c)).concat(" | ");
		}
		return output;
	}

	public void refresh() {
		write(Board.getBoardSize(), this.board.getPrintableGuesses(), this.board.getPrintableFeedbacks());
	}
}
