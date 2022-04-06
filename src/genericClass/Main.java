package genericClass;

public class Main {
	
	public static void main(String[] args) {
		GenericDemo<Integer> intObjDemo = new GenericDemo<Integer>(5);
		System.out.println("Generic Class returns: " + intObjDemo.getData());
		
		GenericDemo<String> stringObj = new GenericDemo<>("Java Programming");
	    System.out.println("Generic Class returns: " + stringObj.getData());
		
	    
	    //Methods
	    GenericeDemo2 demo2 = new GenericeDemo2();
	    demo2.<String>genericsMethod("Java Programming");

	    demo2.<Integer>genericsMethod(1234);
	}

}
