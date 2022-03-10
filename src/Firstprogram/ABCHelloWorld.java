package Firstprogram;



public class ABCHelloWorld {

	public static void main(String[] a)
	{
		
		HelloWorld1 h1 = new HelloWorld1();
		HelloWorld1.hello();
		System.out.println(main());
		h1.hello2();
	}
	
	public static int main() {
		int a = 12;
		return a;
	}
	
}
class HelloWorld1{
	
	public static void hello() {
		System.out.println("Hello World");
	}
	public void hello2() {
		System.out.println("Hello World 2");
	}
	
}
