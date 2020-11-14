package mastermind.views.console;

import java.io.IOException;
import java.util.regex.Pattern;

import mastermind.ui.MessageLibrary;

public class Dialog {

	public static String read(String validator, MessageLibrary inputMessage, MessageLibrary errorMessage) {
		write(inputMessage.getMessage());
		String input = read();

		if (Pattern.matches(validator, input)) {
			return input;
		} else {
			write(errorMessage.getMessage());
			return read(validator, inputMessage, errorMessage);
		}
	}

	public static void write(ConsoleFormat message, Object... args) {
		write(String.format(message.getMessage(), args));
	}

	public static void write(String output) {
		Console.getInstance().write(output);
	}

	private static String read() {
		String input = null;

		try {
			input = Console.getInstance().read();
		} catch (IOException e) {}
		return input;
	}
}
