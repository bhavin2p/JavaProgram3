package stringBufferBuilder;

public class BufferDemo {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello World");
		
		System.out.println(s1.reverse());
		
		s1.setCharAt(5, 'h');
		System.out.println(s1);

	}

}
