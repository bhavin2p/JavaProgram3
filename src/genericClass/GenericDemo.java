package genericClass;

public class GenericDemo<T> {
	
	private T data;

	  public GenericDemo(T data) {
	    this.data = data;
	  }

	  // method that return T type variable
	  public T getData() {
	    return this.data;
	  }

}
