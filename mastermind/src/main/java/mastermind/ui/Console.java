package mastermind.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

	public static Console console;

	private BufferedReader reader;

	public static Console getInstance() {
		if (console == null) {
			console = new Console();
		}
		return console;
	}

	private Console() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public String read() throws IOException {
		return reader.readLine();
	}

	public void write(String message) {
		System.out.println(message);
	};
}
