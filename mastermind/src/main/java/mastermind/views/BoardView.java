package mastermind.views;

import java.util.List;

import mastermind.models.Code;
import mastermind.models.Key;
import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class BoardView {

	public static void write(int size, List<Code> guesses, List<Key> feedbacks) {
		Dialog.write(Message.LINE_SEPARATOR);
		for (int i = 0; i < size; i++) {
			if (guesses != null && guesses.size() > i) {
				Dialog.write(guesses.get(i).write().concat(Message.BOARD_SEPARATOR.getMessage())
						.concat(feedbacks.get(i).write()));
			} else {
				Dialog.write(Message.LINE_EMPTY);
			}
		}
		Dialog.write(Message.LINE_SEPARATOR);
	}
}
