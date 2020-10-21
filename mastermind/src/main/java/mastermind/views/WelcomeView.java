package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class WelcomeView {
	
	public static void write() {
		Dialog.write(Message.LINE_SEPARATOR);
		Dialog.write(Message.TITLE);
		Dialog.write(Message.LINE_SEPARATOR);
	}
}
