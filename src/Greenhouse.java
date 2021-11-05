import java.util.ArrayList;

public class Greenhouse {
	ArrayList<Plant> plants;
	
	public static void main(String[] args) {
		Greenhouse g = new Greenhouse();
		g.printPlants();
	}
	
	public Greenhouse() {
		plants = new ArrayList<Plant>();
		addPlants();
	}
	
	private void addPlants() {
		Plant rose = new Plant("Rose", 24, "RED");
		Plant cactus = new Plant("Cactus", 10, "GREEN");
		plants.add(rose);
		plants.add(cactus);
	}
	
	private void printPlants() {
		System.out.println("The plants in the greenhouse are: ");
		for(Plant p : plants) {
			System.out.println(p);
		}
	}
}
