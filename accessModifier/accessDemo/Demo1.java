package accessDemo;

public class Demo1 {
	// Default
	// private : within class outside class we can not access
	// public : we can access from anywhere / outside / same package
	// protected : within class and outside class in same package / in another
	// package through inheritance
	protected int a = 10;

	//protected
	protected void printPrivateInProtected() {
		System.out.println("The value of A in protected method : " + a);
	}

	public void printPrivateInPublic() {
		System.out.println("The value of A in Public method : " + a);
	}
	
	private void printPrivateInPrivate() {
		System.out.println("The value of A in private method : " + a);
	}

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		demo1.printPrivateInPrivate();
		System.out.println("The value : " +demo1.a);
		//demo1.printPrivateInPublic();

	}

}
