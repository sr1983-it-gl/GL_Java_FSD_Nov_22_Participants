
public class Array2D {

	public static void main(String[] args) {
		
		int array[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
				
		for (int rowIndex = 0; rowIndex < 3; rowIndex ++) {
			
			for (int colIndex = 0; colIndex < 4; colIndex ++) {
				
				System.out.print(array[rowIndex][colIndex] + " ");
			}
			System.out.println();
		}
		
		System.out.println(array);
	}
}
