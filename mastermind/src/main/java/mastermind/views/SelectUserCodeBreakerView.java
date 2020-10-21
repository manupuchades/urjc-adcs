package mastermind.views;

import org.apache.commons.lang3.StringUtils;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class SelectUserCodeBreakerView {
	private static final String INPUT_VALIDATOR = "^[UuMm]$";
	
	private static final String USER = "U"; 
	
	public static boolean read() {
		return StringUtils.equalsIgnoreCase(USER, Dialog.read(INPUT_VALIDATOR, Message.ENTER_CODEBREAKER, Message.ERROR_INVALID_INPUT));
	}
}
