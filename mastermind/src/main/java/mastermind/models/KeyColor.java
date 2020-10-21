package mastermind.models;

public enum KeyColor {
	BLACK ("B"), 
	WHITE ("W"), 
	NULL ("_");
	
	private String color;

	private KeyColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
