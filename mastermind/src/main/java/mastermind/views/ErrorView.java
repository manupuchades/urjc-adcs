package mastermind.views;

import mastermind.ui.ConsoleFormat;
import mastermind.ui.Dialog;
import mastermind.ui.MessageLibrary;

public class ErrorView {

	public static void write() {
		Dialog.write(ConsoleFormat.BOARD_SEPARATOR);
		Dialog.write(MessageLibrary.ERROR_TECHNICAL.getMessage());
		Dialog.write(ConsoleFormat.BOARD_SEPARATOR);
	}
}
