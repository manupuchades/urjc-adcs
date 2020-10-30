package mastermind.views.console.writers;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.ConsoleFormat;
import mastermind.views.console.Dialog;

public class WinnerView {
	
	public static void write() {
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		Dialog.write(ConsoleFormat.FEEDBACK_YOU_WIN, MessageLibrary.FEEDBACK_YOU_WIN.getMessage());
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
	}
}
