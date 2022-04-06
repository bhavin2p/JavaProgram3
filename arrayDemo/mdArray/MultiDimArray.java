package mdArray;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int arr[][] = {{101,102},
						{201,202}
						};
		
		//System.out.println(arr[1][1]);
		
		for(int i = 0; i<arr.length;i++) { //row
			for(int j = 0;j<arr[i].length;j++) { //col
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
