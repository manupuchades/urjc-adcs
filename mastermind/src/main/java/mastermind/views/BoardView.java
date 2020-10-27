package mastermind.views;

import java.util.List;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class BoardView {

	public static void write(int size, List<String> guesses, List<String> feedbacks) {
		Dialog.write(Message.LINE_SEPARATOR);
		for (int i = 0; i < size; i++) {
			if (guesses != null && guesses.size() > i) {
				Dialog.write(formatter(guesses.get(i)).concat(Message.BOARD_SEPARATOR.getMessage())
						.concat(formatter(feedbacks.get(i))));
			} else {
				Dialog.write(Message.LINE_EMPTY);
			}
		}
		Dialog.write(Message.LINE_SEPARATOR);
	}

	private static String formatter(String input) {
		String output = "| ";

		for (char c : input.toCharArray()) {
			output = output.concat(String.valueOf(c)).concat(" | ");
		}
		return output;
	}

}
