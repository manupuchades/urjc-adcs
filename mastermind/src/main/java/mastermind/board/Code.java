package mastermind.board;

import java.util.Random;

public class Code {
	
	public static final String codeValidator = "^[UGRY]{4}$";
	
	protected static final int CODE_SIZE = 4;
	
	private CodeColor[] code;
	
	public Code(String input) {
		CodeColor[] pattern = new CodeColor[CODE_SIZE];
		
		for (int i = 0; i<CODE_SIZE; i++) {
			pattern[i] = CodeColor.getColor(String.valueOf(input.charAt(i)));	
		}
		
		this.code = pattern;
	}
	
	public Code(CodeColor[] code) {
		this.code = code;
	}
	
	public String write() {
		String output = "| ";
		
		for (CodeColor cc:  this.code) {
			output = output.concat(cc.getColor()).concat(" | ");	
		}
		return output;
	}
	
	public static Code getRandomCode() {
		CodeColor[] pattern = new CodeColor[CODE_SIZE];
		
		for (int i = 0; i<CODE_SIZE; i++) {
			pattern[i] = CodeColor.values()[new Random().nextInt(CODE_SIZE)];
		}
		
		return new Code(pattern);
	}
	
	public CodeColor getColorAt(int i) {
		return code[i];
	}
}
