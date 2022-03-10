package overloadingDemo;

public class OverloadingDemo {

	int d =5;
	int result;
	//Compile Time Polymorphism / Static binding / method overloading
	//Bhavin
	public void method1(int a, int b) {
		result = a + b;
		System.out.println("Addition = " + result);
	}
	
	//Monali
	public void method1(String a, int b){
		result = d * d;
		//System.out.println( );
	}
	
	//Suzen
	public void method1(int a, int b, int c) {
		result = c / a;
		System.out.println("Division = " +result);
	}
	//Run time polymorphism / Dynamic binding / method overriding
}
