package mastermind.views.mvc;

import mastermind.models.Session;

public abstract class BindedComponent implements Component{

	Container container;
		
	BindedComponent bind (Container container) {
		this.container = container;
		return this;
	}
	
	public abstract void show(Session game);
}
