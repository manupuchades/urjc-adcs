package mastermind.board;

public enum CodeColor {
	BLUE("U"), 
	GREEN("G"), 
	RED("R"), 
	YELLOW("Y"), 
	NULL("_");

	private String color;

	private CodeColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
