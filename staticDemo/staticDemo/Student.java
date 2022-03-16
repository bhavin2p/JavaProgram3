package staticDemo;

public class Student {
	//variable / class / method
	int rollno;
	String name;
	final String college = "ITS" ;
	
	Student(int r, String n) {
		rollno = r;
		name = n;
		System.out.println(rollno + " " + name + " " + college);
	}
	void display() {
		//college = "JNS";
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String[] args) {
		 Student s1 = new Student(111,"Karan" );  
		 Student s2 = new Student(222,"Aryan");    
		 //s1.display();  
		 //s2.display();  
	}

}
