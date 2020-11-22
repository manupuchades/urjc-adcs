package mastermind.views.mvc;

import mastermind.models.Session;

public class EndView extends BindedComponent {

	@Override
	public void show(Session session) {
		// TODO Auto-generated method stub
		
		System.out.println("EndView");
		session.kill();
	}

}
