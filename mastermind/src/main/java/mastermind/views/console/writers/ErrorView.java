package mastermind.views.console.writers;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.ConsoleFormat;
import mastermind.views.console.Dialog;

public class ErrorView {

	public static void write() {
		Dialog.write(ConsoleFormat.BOARD_SEPARATOR);
		Dialog.write(MessageLibrary.ERROR_INVALID_INPUT.getMessage());
		Dialog.write(ConsoleFormat.BOARD_SEPARATOR);
	}
}
