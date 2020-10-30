package mastermind.views.console.readers;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.Dialog;

public class SelectUserCodeMakerView {
	private static final String INPUT_VALIDATOR = "^[UuMm]$";
		
	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_CODEMAKER, MessageLibrary.ERROR_INVALID_INPUT);
	}
}
