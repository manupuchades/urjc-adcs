package mastermind.views.console.readers;

import java.util.List;

import mastermind.ui.MessageLibrary;
import mastermind.views.ViewObserver;
import mastermind.views.ViewReader;
import mastermind.views.console.Dialog;

public class EnterActionView extends ViewReader{
	public EnterActionView(List<ViewObserver> observers) {
		super(observers);
	}

	private static final String INPUT_VALIDATOR = "^[UGRY]{4}$|^[UR]{1}$";
	
	protected String input() {
		return Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_PATTERN_CODE, MessageLibrary.ERROR_INVALID_INPUT);
	}
	
}