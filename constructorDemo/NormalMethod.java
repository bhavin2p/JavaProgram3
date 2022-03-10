
public class NormalMethod {
	
	//constructor overloading
	//public / private / protected / default
	//Constructor = default constructor
	private NormalMethod() {
		System.out.println("Special Method");
	}
	
	public NormalMethod(int a) {
		System.out.println(a);
	}
	//access modifier
	//Parameter Contructor
	protected NormalMethod(String a) {
		System.out.println("Parameter passed : " +a);
	}
	
	//normal
	public void SimpleMethod() {
		System.out.println("Normal Method");
	}
	
	public static void main(String[] args) {
		NormalMethod n2 = new NormalMethod();
		NormalMethod n3 = new NormalMethod(2);
		NormalMethod n1 = new NormalMethod("Constructor");
		//n1.SimpleMethod();
	}

}
