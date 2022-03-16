package staticDemo;

public class DemoStatic {
	
	public static int a = 10;
	int b = 20;
	public static void MethodA() {
		System.out.println(a);
	}
	//Non-Static to Static --> error 
	//Static to Static -> right way
	//Static to Non-Static -- valid 
	public void MethodB() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		
	}

}
