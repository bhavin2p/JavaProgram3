package innerDemoSample;


class Outer{
	static int a;
	public static void show() {
		
	}
	//member class
	static class Inner{
		
		public void display() {
			System.out.println("in display");
		}
		
	}
	
}


public class InnerDemo {
	
	//variables, methods

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		
		//Outer.Inner obj1 = obj.new Inner();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}

}
