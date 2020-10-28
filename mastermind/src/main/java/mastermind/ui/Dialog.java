package mastermind.ui;

import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

import mastermind.views.ErrorView;

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

	public static void write(ConsoleFormat message, Object...args) {		
		write(String.format(message.getMessage(), args));
	}
	
	public static void write(MessageLibrary message) {		
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
