package mastermind.ui;

public enum MessageLibrary {
	TITLE ("app.title"),
	
	FEEDBACK_GAMEOVER ("feedback.gameover"),
	FEEDBACK_MAX_ATTEMPS ("feedback.attemps"),
	FEEDBACK_YOU_WIN ("feedback.winner"),
	
	ENTER_CODEMAKER ("enter.codemaker"),
	ENTER_CODEBREAKER ("enter.codebreaker"),
	ENTER_SECRET_CODE ("enter.secret"),
	ENTER_PATTERN_CODE ("enter.code"),
	ENTER_RESUME_GAME ("enter.resume"),
	ERROR_INVALID_INPUT ("error.invalid.input"),
	ERROR_TECHNICAL ("error.technical");
	
	private String message;
	
	private MessageLibrary (String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return Label.getLabel(this.message);
	}

}
