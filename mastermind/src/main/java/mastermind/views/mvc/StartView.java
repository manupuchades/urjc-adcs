package mastermind.views.mvc;

import mastermind.models.Session;
import mastermind.ui.MessageLibrary;
import mastermind.views.console.ConsoleFormat;
import mastermind.views.console.Dialog;

public class StartView extends BindedComponent {

	@Override
	public void show(Session session) {
		
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		Dialog.write(ConsoleFormat.TITLE, MessageLibrary.TITLE.getMessage());
		Dialog.write(ConsoleFormat.LINE_SEPARATOR);
		
		container.display(new BoardView());
	}

}
