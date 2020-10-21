package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class EnterCodeView {
	private static final String INPUT_VALIDATOR = "^[UGRY]{4}$";

	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, Message.ENTER_PATTERN_CODE, Message.ERROR_INVALID_INPUT);
	}
}
