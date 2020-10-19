package mastermind.ui;

import java.io.IOException;
import java.util.regex.Pattern;

import mastermind.views.ErrorView;

public class Dialog {

	public static String read(String validator, Message inputMessage, Message errorMessage) {
		write(inputMessage);
		String input = read();
		
		if (Pattern.matches(validator, input)) {
			return input;
		} else {
			write(errorMessage);
			return read(validator, inputMessage, errorMessage);
		}
	}

	public static void write(Message message) {
		write(message.getMessage());
	}

	public static void write(String output) {
		Console.getInstance().write(output);
	}
	
	private static String read() {
		String input = null;

		try {
			input = Console.getInstance().read();
		} catch (IOException e) {
			ErrorView.write();
		}
		return input;
	}
}
