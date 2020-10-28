package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.MessageLibrary;
import mastermind.ui.ConsoleFormat;

public class WinnerView {
	
	public static void write() {
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		Dialog.write(ConsoleFormat.FEEDBACK_YOU_WIN, MessageLibrary.FEEDBACK_YOU_WIN.getMessage());
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
	}
}
