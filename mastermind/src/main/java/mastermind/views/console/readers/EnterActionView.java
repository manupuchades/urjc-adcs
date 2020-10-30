package mastermind.views.console.readers;

import java.util.ArrayList;
import java.util.List;

import mastermind.ui.MessageLibrary;
import mastermind.views.ViewObserver;
import mastermind.views.console.Dialog;

public class EnterActionView {
	private static final String INPUT_VALIDATOR = "^[UGRY]{4}$|^[UR]{1}$";
	
	private List<ViewObserver> observers; 
	
	public EnterActionView(List<ViewObserver> observers) {
		this.observers = new ArrayList<ViewObserver>(observers);
	}

	public void read() {
		notifyObservers(Dialog.read(INPUT_VALIDATOR, MessageLibrary.ENTER_PATTERN_CODE, MessageLibrary.ERROR_INVALID_INPUT));
	}
	
	private void notifyObservers(String input) {
		for(ViewObserver observer: observers) {
			observer.receive(input);
		}
	}
}