package inheritanceDemo;

public class BMW extends Car {
	
	public BMW() {
		System.out.println("key not matched");
	}
	
	public void musicOn() {
		System.out.println("music mode is ON");
		
	}
	//super.method()
	//super() - constructor
	//super.variable

	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.start();
		b1.musicOn();
		b1.stop();
		
	}

}
