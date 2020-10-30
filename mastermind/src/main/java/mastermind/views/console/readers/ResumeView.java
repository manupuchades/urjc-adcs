package mastermind.views.console.readers;

import org.apache.commons.lang3.StringUtils;

import mastermind.ui.MessageLibrary;
import mastermind.views.console.Dialog;

public class ResumeView {
	
	private static final String INPUT_VALIDATOR = "^[YyNn]$";
	
	private static final String YES = "Y"; 
	
	public static boolean read() {
		return StringUtils.equalsIgnoreCase(YES, Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_RESUME_GAME, MessageLibrary.ERROR_INVALID_INPUT));
	}
}
