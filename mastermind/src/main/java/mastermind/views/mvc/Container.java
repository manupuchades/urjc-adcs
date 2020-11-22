package mastermind.views.mvc;

import java.util.List;

import mastermind.models.Session;

public abstract class Container extends BindedComponent {

	public Container() {}

	protected List<Component> elements;

	public void show(Session game) {
		
		for (Component e : elements) {
			e.show(game);
		}

		if (game.isActive())
			this.show(game);
	}

	public abstract void display(BindedComponent component);

}
