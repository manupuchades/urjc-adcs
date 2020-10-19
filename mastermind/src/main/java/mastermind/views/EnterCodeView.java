package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class EnterCodeView {
	private static final String INPUT_VALIDATOR = "^[UGRY]{4}$";

	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, Message.ENTER_CONTINUE_GAME, Message.ERROR_INVALID_INPUT);
	}
}
