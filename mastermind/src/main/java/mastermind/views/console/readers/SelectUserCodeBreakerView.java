package mastermind.views.console.readers;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.Dialog;

public class SelectUserCodeBreakerView {
	private static final String INPUT_VALIDATOR = "^[UuMm]$";
		
	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_CODEBREAKER, MessageLibrary.ERROR_INVALID_INPUT);
	}
}
