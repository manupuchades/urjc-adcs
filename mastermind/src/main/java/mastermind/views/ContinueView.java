package mastermind.views;

import org.apache.commons.lang3.StringUtils;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class ContinueView {
	
	private static final String INPUT_VALIDATOR = "^[YyNn]$";
	
	private static final String YES = "Y"; 
	
	public static boolean read() {
		return StringUtils.equalsIgnoreCase(YES, Dialog.read(INPUT_VALIDATOR, Message.ENTER_CONTINUE_GAME, Message.ERROR_INVALID_INPUT));
	}
}
