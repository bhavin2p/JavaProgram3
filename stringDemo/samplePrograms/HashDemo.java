package samplePrograms;

public class HashDemo {

	public static void main(String[] args) {
		String a = "200";
        String b =  new String("200");

        if(a.equals(b)){
            System.out.println("Equal variables:");
            System.out.println(a.hashCode() + "\n" + b.hashCode());
            System.out.println(System.identityHashCode(a) + " b = " +System.identityHashCode(b));
        }

        String c = "10";
        String d = "50";

        if(!c.equals(d)){
            System.out.println("\nUn-equal variables:");
            System.out.println(c.hashCode() + "\n" + d.hashCode());
        }

	}

}
