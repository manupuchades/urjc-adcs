package mastermind.ui;

public enum ConsoleFormat {
	TITLE ("|    *** %s ***    |"),
	FEEDBACK_GAMEOVER ("| ***          %s          ***  |\r\n"
			+ "%s"),
	FEEDBACK_YOU_WIN ("| *** %s ***  |"),
	BOARD_SEPARATOR ("*** "),
	LINE_EMPTY ("| _ | _ | _ | _ | *** | _ | _ | _ | _ |"),
	LINE_SEPARATOR ("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	
	private String message;
	
	private ConsoleFormat (String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
