
public class Array2DLength {

	public static void main(String[] args) {
		
		int array[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8, 12, 2, 12, 12},
				{9, 10, 11, 12, 1, 1,1, 1,1, 1,1, 1,1, 1}
		};
		
		System.out.println("Array Length -> " + array.length);
		
		for (int index = 0; index < array.length; index ++) {
			
			int length = array[index].length;
			
			System.out.println(length);
		}
		
		
	}
}
