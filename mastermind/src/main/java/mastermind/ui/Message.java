package mastermind.ui;

public enum Message {
	TITLE ("*** Welcome to Mastermind ***"),
	FEEDBACK_GAMEOVER ("GAMEOVER - You have reached the maximum of attemps"),
	FEEDBACK_YOU_WIN ("Congratulations - You win!"),
	BOARD_SEPARATOR ("*** "),
	LINE_EMPTY ("| _ | _ | _ | _ | *** | _ | _ | _ | _ |"),
	LINE_SEPARATOR ("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"),
	ENTER_SECRET_CODE ("Secretly enter a code pattern : "),
	ENTER_PATTERN_CODE ("Enter a code pattern : "),
	ENTER_CONTINUE_GAME ("Continue game (y/n)? : "),
	ERROR_INVALID_INPUT ("Input value is not valid."),
	ERROR_TECHNICAL ("Unexpected error ocurred!");
	
	private String message;
	
	private Message (String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
