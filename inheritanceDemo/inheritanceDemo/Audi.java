package inheritanceDemo;

public class Audi extends Car{

	//method overriding 
	/*public void start() {
		System.out.println("car started...... + Music started");
	}*/
	
	public void music() {
		super.start();
		System.out.println("Music Started....");
		super.stop();
	}
	
	public static void main(String[] args) {
		Audi a1 = new Audi();
		a1.music();

	}

}
