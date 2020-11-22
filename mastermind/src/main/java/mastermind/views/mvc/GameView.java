package mastermind.views.mvc;

import java.util.ArrayList;

public class GameView extends Container{
	
	public GameView(){
		display(new StartView());
	}

	@Override
	public void display(BindedComponent component) {
		elements = new ArrayList<Component>();
		this.elements.add(component.bind(this));
	}

}
