package interfaceDemo;

public class MainClassInter implements Interface1, Interface2{

	public static void classStatic() {
		System.out.println("Static method inside class");
	}
	
	public static void main(String[] args) {
		MainClassInter m1 = new MainClassInter();
		m1.abstraceMethodInterface2();
		m1.sampleMethod();
		Interface1.staticMethod();
		MainClassInter.classStatic();
		System.out.println(MainClassInter.pi);
	}

	public void sampleMethod() {
		System.out.println("From Interrface1");
	}

	public void abstraceMethodInterface2() {
		System.out.println("From Interrface2");
	}

}
