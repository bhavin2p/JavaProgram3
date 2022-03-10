package abstraction;

public class BMW extends Car {

	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.start();
		b1.music();
		b1.safety();
		b1.stop();
		b1.FinalMethod();
		Car.StaticMethod();

	}
	public void start() {
		System.out.println("Car Started");
	}
	public void stop() {
		System.out.println("Car stopped");
	}
	public void safety() {
		System.out.println("safety features added to Car. SeatBelt");
	}

}
