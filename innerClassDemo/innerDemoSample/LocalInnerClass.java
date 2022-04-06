package innerDemoSample;

public class LocalInnerClass {

	private int data = 30;// instance variable

	void display() {
		class Local { // class created inside method
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInnerClass l1 = new LocalInnerClass();
		l1.display();

	}

}
