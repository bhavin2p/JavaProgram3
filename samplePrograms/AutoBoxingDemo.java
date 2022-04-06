import java.util.ArrayList;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		int j = 500;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(j);
		
		System.out.println(list);
		System.out.println(list.get(0));

	}

}
