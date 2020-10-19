package mastermind.board;

import java.util.Random;

public class Code {
	
	public static final String codeValidator = "^[UGRY]{4}$";
	
	private static final int CODE_SIZE = 4;
	
	private CodeColor[] code;
	
	public Code(String code) {
		
	}
	
	public Code(CodeColor[] code) {
		this.code = code;
	}
	
	public static boolean isValid(String input) {
		return true;
	}
	
	public String write() {
		String code = "";
		
		for (int i = 0; i<CODE_SIZE; i++) {
			code.concat(this.code[i].getColor());
		}
		
		return code;
	}
	
	public static Code getRandomCode() {
		CodeColor[] code = new CodeColor[4];
		
		for (int i = 0; i<CODE_SIZE; i++) {
			code[i] = CodeColor.values()[new Random().nextInt(CODE_SIZE)];
		}
		
		return new Code(code);
	}
}
