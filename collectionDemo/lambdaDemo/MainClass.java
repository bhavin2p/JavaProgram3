package lambdaDemo;

public class MainClass {

	public static void main(String[] args) {
		SingleArgument sa1 =  n -> 
		System.out.println(n);
		SingleArgument sal2 = n -> System.out.println("The String from interface" +n);
		sa1.foo("Let us all");
		sal2.foo(" learn lambda syntax");

	}

}
