package mastermind.ui;

public enum Message {
	TITLE ("|    *** Welcome to Mastermind ***    |"),
	FEEDBACK_GAMEOVER ("| ***          GAMEOVER          ***  |\r\n"
			+ "You have reached the maximum of attemps"),
	FEEDBACK_YOU_WIN ("| *** Congratulations - You win! ***  |"),
	BOARD_SEPARATOR ("*** "),
	LINE_EMPTY ("| _ | _ | _ | _ | *** | _ | _ | _ | _ |"),
	LINE_SEPARATOR ("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"),
	ENTER_CODEMAKER ("Select codemaker (User/Machine)? : "),
	ENTER_CODEBREAKER ("Select codebreaker (User/Machine)? : "),
	ENTER_SECRET_CODE ("Enter a secret code privately: "),
	ENTER_PATTERN_CODE ("Enter a code pattern {blUe, Green, Red, Yellow}: "),
	ENTER_RESUME_GAME ("Continue game (y/n)? : "),
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
