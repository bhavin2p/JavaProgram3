package finalDemo;

public class MethodFinal {

	public final void ValueB() {
		System.out.println(100+200);
	}
	
	public void ValueC() {
		System.out.println("Non-Final");
	}
	
	
	public final int ValueA() {
		
		return 100;
	}
	public static void main(String[] args) {
		
		MethodFinal m1 = new MethodFinal();
		System.out.println(m1.ValueA());
		m1.ValueB();
		m1.ValueC();
		
		ClassFinal c1 = new ClassFinal();
		c1.ValueA();
		

	}

}
