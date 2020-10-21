package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class SelectUserCodeBreakerView {
	private static final String INPUT_VALIDATOR = "^[UuMm]$";
		
	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, Message.ENTER_CODEBREAKER, Message.ERROR_INVALID_INPUT);
	}
}
