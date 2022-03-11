package abstraction;

public abstract class Car {
	
	final static double pi = 3.14;
	
	public Car() {
		System.out.println("Hello Car Constructor");
	}
	//0% to 100%
	//BMW // HONDA
	//abstract and non-abstract methods
	//start
	public abstract void start();
	//stop
	public abstract void stop();
	//safety
	public abstract void safety();
	
	//music {non-abstract}
	
	public void music() {
		System.out.println("Music Started");
	}
	
	//Final
	public final void FinalMethod() {
		System.out.println("Final Method");
	}
	
	//Static
	public static void StaticMethod() {
		System.out.println("Static Method");
	}

}
