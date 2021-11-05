import java.awt.Color;

public class Plant {
	String type;
	int height;
	String color;
	
	public Plant(String type, int height, String colorStr) {
		this.type = type;
		this.height = height;
		this.color = color;
		
	}
	
	@Override
	public String toString() {
		return "Type: " + type + ", Height: " + Integer.toString(height) + " inches, Color: " + color;
	}
}
