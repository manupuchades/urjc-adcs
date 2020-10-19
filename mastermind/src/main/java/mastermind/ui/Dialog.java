package mastermind.ui;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

import mastermind.board.Code;
import mastermind.board.Key;

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

	public static void writeBoard(int size, List<Code> guesses, List<Key> feedbacks) {
		
	}
	
	public static boolean continueGame() {
		return StringUtils.equalsIgnoreCase("Y", read("^[YyNn]$", Message.ENTER_CONTINUE_GAME, Message.ERROR_INVALID_INPUT));
	}

	public static void write(Message message) {
		Console.getInstance().write(message.getMessage());
	}

	private static String read() {
		String input = null;

		try {
			input = Console.getInstance().read();
		} catch (IOException e) {
			write(Message.ERROR_TECHNICAL);
		}
		return input;
	}
}
