package staticDemo;

public class DemoMainOther extends DemoStatic {

	public static void MethodE() {
		System.out.println(DemoStatic.a);
		DemoStatic.MethodA();
		
		//object.MethodName()
		//className.MethodName / DemoMainOther.MethodA()
		//className.variableName / DemoMainOther.a == static int a = 10
	}
	public static void main(String[] args) {
		MethodE();
		DemoMainOther d1 = new DemoMainOther();
	
	}

}
