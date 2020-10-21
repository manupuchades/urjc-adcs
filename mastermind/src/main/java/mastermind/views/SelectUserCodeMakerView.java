package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class SelectUserCodeMakerView {
	private static final String INPUT_VALIDATOR = "^[UuMm]$";
		
	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, Message.ENTER_CODEMAKER, Message.ERROR_INVALID_INPUT);
	}
}
