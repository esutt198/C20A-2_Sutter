import java.awt.Color;

public class Plant {
	String type;
	int height;
	Color color;
	
	public Plant(String type, int height, String colorStr) {
		this.type = type;
		this.height = height;
		try {
			this.color = (Color) Color.class.getDeclaredField(colorStr).get(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	
	@Override
	public String toString() {
		return "Type: " + type + ", Height: " + Integer.toString(height) + " inches, Color: " + color.toString();
	}
}
