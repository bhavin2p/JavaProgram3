package finalDemo;

public class VariableFinal extends MethodFinal {

	final double pi = 3.14;
	
	public void Display() {
		//pi = 3.16; // we cannot change variable declared as final = value will be constant
		System.out.println(pi);
	}
	
	public static void main(String[] args) {
		VariableFinal v1 = new VariableFinal();
		v1.Display();

	}

}
