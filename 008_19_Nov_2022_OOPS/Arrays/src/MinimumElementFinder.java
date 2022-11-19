import java.util.Random;

public class MinimumElementFinder {

	public static void main(String[] args) {
		
		int[] array = new int[5];

		Random random = new Random();

		for (int index = 0; index < array.length; index ++) {
			
			array[index] = random.nextInt(10000);
			
			System.out.println(array[index]);
		}

		int minimum = array[0];
		
		for (int index = 1; index < array.length; index ++) {
			
			int element = array[index];
			if (element < minimum) {
				minimum = element;
			}
		}
		
		System.out.println("Minimum Element ->" + minimum);
				
	}
}
