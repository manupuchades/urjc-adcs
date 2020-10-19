package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class ErrorView {

	public static void write() {
		Dialog.write(Message.BOARD_SEPARATOR);
		Dialog.write(Message.ERROR_TECHNICAL);
		Dialog.write(Message.BOARD_SEPARATOR);
	}
}
