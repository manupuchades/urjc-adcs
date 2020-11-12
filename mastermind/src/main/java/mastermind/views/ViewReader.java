package mastermind.views;

import java.util.ArrayList;
import java.util.List;

public abstract class ViewReader {
	private List<ViewObserver> observers; 
	
	public ViewReader (List<ViewObserver> observers) {
		this.observers = new ArrayList<ViewObserver>(observers);
	}
	
	public void read() {
		notifyObservers(input());
	}
	
	protected abstract String input();
	
	private void notifyObservers(String input) {
		for(ViewObserver observer: observers) {
			observer.receive(input);
		}
	}

}
