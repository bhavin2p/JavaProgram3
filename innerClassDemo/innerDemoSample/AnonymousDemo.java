package innerDemoSample;


class A{
	public void show() {
		System.out.println("in A show");
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {
		A obj = new A() {
			public void show() {
				System.out.println("I am the best");
			}
		};
		obj.show();

	}

}
