package mastermind.views.mvc;

import mastermind.controllers.mvc.BoardController;
import mastermind.models.Session;

public class BoardView extends BindedComponent {
	
	BoardController boardController;
	
	@Override
	public void show(Session session) {
		
		boardController =  new BoardController (session);
		// TODO Auto-generated method stub
		System.out.println("MiddleView");
		
		container.display(new EndView());
	}

}
