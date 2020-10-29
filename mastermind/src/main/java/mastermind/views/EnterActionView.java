package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.MessageLibrary;

public class EnterActionView {
	private static final String INPUT_VALIDATOR = "^[UGRY]{4}$|^[UR]{1}$";

	public static String read() {
		return Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_PATTERN_CODE, MessageLibrary.ERROR_INVALID_INPUT);
	}
	
	public static void invalidInput() {
		Dialog.write(MessageLibrary.ERROR_INVALID_INPUT.getMessage());
	}
}