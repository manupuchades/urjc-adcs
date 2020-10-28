package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.MessageLibrary;

public class SelectUserCodeBreakerView {
	private static final String INPUT_VALIDATOR = "^[UuMm]$";
		
	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_CODEBREAKER, MessageLibrary.ERROR_INVALID_INPUT);
	}
}
