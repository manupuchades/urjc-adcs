package mastermind.views;

import mastermind.ui.Dialog;
import mastermind.ui.Message;

public class GameOverView {

	public static void write() {
		Dialog.write(Message.LINE_SEPARATOR);
		Dialog.write(Message.FEEDBACK_GAMEOVER);
		Dialog.write(Message.LINE_SEPARATOR);
	}
}
