package upcasting;

public class MainClass {

	public static void main(String[] args) {
		
		Animal animal = new Fish();
		animal.name = "Goldfish";
		
		Fish fish = new Fish();
		fish.name = "Whale";
		fish.color = "Blue";
		
		System.out.println("Object a");
        System.out.println("Name: " + animal.name);
        animal.nature();
        
        System.out.println("Object f");
        System.out.println("Name: " + fish.name);
        System.out.println("Color: " + fish.color);
        fish.nature();

	}

}
