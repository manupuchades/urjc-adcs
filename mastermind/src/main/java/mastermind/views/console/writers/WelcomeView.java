package mastermind.views.console.writers;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.ConsoleFormat;
import mastermind.views.console.Dialog;

public class WelcomeView {
	
	public static void write() {
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		Dialog.write(ConsoleFormat.TITLE, MessageLibrary.TITLE.getMessage());
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
	}
}
