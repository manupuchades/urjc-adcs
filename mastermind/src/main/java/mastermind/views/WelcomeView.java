package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.MessageLibrary;
import mastermind.ui.ConsoleFormat;

public class WelcomeView {
	
	public static void write() {
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		Dialog.write(ConsoleFormat.TITLE, MessageLibrary.TITLE.getMessage());
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
	}
}
