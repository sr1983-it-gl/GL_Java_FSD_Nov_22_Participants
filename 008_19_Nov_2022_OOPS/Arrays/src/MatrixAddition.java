

public class MatrixAddition {

	public static void main(String[] args) {
		
		int a[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};

		int b[][] = {
				{11, 2, 13, 4},
				{15, 6, 17, 18},
				{9, 110, 11, 212}
		};
		
		int c[][] = new int[a.length][a[0].length];
		
		for (int rowIndex = 0; rowIndex < a.length; rowIndex ++ ) {
			
			for (int colIndex = 0; colIndex < a[rowIndex].length; colIndex ++) {
				
				c[rowIndex][colIndex]=
				a[rowIndex][colIndex] + b[rowIndex][colIndex];
				
				System.out.print(c[rowIndex][colIndex] + " ");
			}
			
			System.out.println();
		}		
	}
}
