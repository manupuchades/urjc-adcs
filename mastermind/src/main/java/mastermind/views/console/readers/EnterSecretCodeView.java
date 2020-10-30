package mastermind.views.console.readers;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.Dialog;

public class EnterSecretCodeView {
	private static final String INPUT_VALIDATOR = "^[UGRY]{4}$";

	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_SECRET_CODE, MessageLibrary.ERROR_INVALID_INPUT);
	}
}
