package inheritanceDemo;

public class Honda extends Car {
	
	public void adjustSpeed() {
		System.out.println("adjust speed at : " + super.a );
	}

	public static void main(String[] args) {
		Honda h1 = new Honda();
		h1.start();
		h1.adjustSpeed();
		h1.stop();

	}

}
