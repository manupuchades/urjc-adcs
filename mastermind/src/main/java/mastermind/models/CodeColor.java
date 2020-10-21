package mastermind.models;

public enum CodeColor {
	BLUE("U"), GREEN("G"), RED("R"), YELLOW("Y"), NULL("_");

	private String color;

	private CodeColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public static CodeColor getColor(String color) {
		for (CodeColor c : CodeColor.values()) {
			if (c.getColor().equals(color)) {
				return c;
			}
		}
		return CodeColor.NULL;
	}
}
