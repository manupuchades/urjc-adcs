package mastermind;

import mastermind.models.Session;
import mastermind.views.mvc.GameView;

public class Mastermind {

	private Session game;
	private GameView view;

	Mastermind() {
		this.game = new Session();
		this.view = new GameView();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

	private void play() {
		view.show(this.game);
	}
}
