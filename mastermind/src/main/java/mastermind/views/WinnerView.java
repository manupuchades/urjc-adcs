package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class WinnerView {
	
	public static void write() {
		Dialog.write(Message.LINE_SEPARATOR);
		Dialog.write(Message.FEEDBACK_YOU_WIN);
		Dialog.write(Message.LINE_SEPARATOR);
	}
}
