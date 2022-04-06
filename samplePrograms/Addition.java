import java.util.ArrayList;
public class Addition {

	public static void main(String[] args) {
		String str = "100.12";	
		double d = 100.54;
		int c = (int) d;
		System.out.println(c);
		double DoubleValue = 3.6987;
		int intV = (int) Math.round(DoubleValue);
		System.out.println(intV);
		String str2	= "200";
		
		//System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		int a = 20;
		//double b = Double.parseDouble(str);
		int b = Integer.parseInt(str);
		//double b = Double.parseDouble(str);
		double result = a+b;
			
		System.out.println(result);
	}
}
