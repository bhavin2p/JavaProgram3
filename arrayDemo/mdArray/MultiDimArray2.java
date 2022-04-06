package mdArray;

public class MultiDimArray2 {

	public static void main(String[] args) {
		int [][]flats = new int[2][3]; //row / col
		
		/*flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;*/
		//flats[1][3] = 204;
		
		//System.out.println(flats[1][2]);
		int count = 101;
		for(int i = 0; i<flats.length;i++) { //row
			for(int j = 0;j<flats[i].length;j++) { //col
				flats[i][j] = count;
				count++;
			}
		}
		
		//printing
		for(int i = 0; i<flats.length;i++) { //row
			for(int j = 0;j<flats[i].length;j++) { //col
				System.out.print(flats[i][j] + " ");
			}
			System.out.println();
		}

	}

}
