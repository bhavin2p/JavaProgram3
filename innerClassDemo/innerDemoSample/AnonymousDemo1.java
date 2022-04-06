package innerDemoSample;

public class AnonymousDemo1 {
	
	public static void main(String[] args) {
		
		//Class
		Object1 obj = new Object1() {
			public void show() {
				
				System.out.println("show method Anonymous");
			}
			
		};
		obj.show();
		
		//Interface
		InterFaceObj obj1 = new InterFaceObj() {
			public void showDemo() {
				System.out.println("Interface AnonymousDemo");
			}
			
		};
		obj1.showDemo();
		
		//Abstract class
		AbstractDemoAn1  obj2 = new AbstractDemoAn1() {
			public void showDemo2() {
				System.out.println("Abstract AnonymousDemo");
			}

			@Override
			public void show1() {
				System.out.println("Test Anonmoyous");				
			}
			
		};
		obj2.showDemo2();
		obj2.show1();
	}

}
