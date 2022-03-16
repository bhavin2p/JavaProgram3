package finalDemo;

public final class ClassFinal extends MethodFinal {
	//if class is final then we cannot inherit or use it as subclass
	
	public void ValueC() {
		System.out.println("Non-Final1");
	}
		
	public void MethodB() {
		System.out.println("Method name Method B");
	}
	
	public void MethodA() {
		System.out.println(10+20);
	}

	public static void main(String[] args) {
		ClassFinal a1 = new ClassFinal();
		a1.MethodA();
		a1.MethodB();
		a1.ValueA();
		a1.ValueB();
		a1.ValueC();
	}
	
}
