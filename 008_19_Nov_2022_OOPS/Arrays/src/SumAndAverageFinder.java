import java.util.Random;

public class SumAndAverageFinder {

	public static void main(String[] args) {
		
		int arrayLength = 100;
		
		int[] array = new int[arrayLength];

		Random random = new Random();

		int sum = 0;
		for (int index = 0; index < array.length; index ++) {
			
			array[index] = random.nextInt(1000);
			
//			System.out.println(array[index]);
			
			sum = sum + array[index];
		}

		System.out.println(
			String.format("Sum of %d numbers is %d", 
				array.length, sum));
		
		float average = (float)sum / array.length;
		System.out.println(
			String.format("Average is %d numbers is %f",
				array.length, average));
	}
}
