package mastermind.views.console.writers;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.ConsoleFormat;
import mastermind.views.console.Dialog;

public class GameOverView {

	public static void write() {
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		Dialog.write(ConsoleFormat.FEEDBACK_GAMEOVER, MessageLibrary.FEEDBACK_GAMEOVER.getMessage(), MessageLibrary.FEEDBACK_MAX_ATTEMPS.getMessage());
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
	}
}
