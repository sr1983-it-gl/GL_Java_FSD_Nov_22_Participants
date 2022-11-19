import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		int[] array = new int[5];

		Random random = new Random();

		for (int index = 0; index < array.length; index ++) {
			
			array[index] = random.nextInt();
			
			System.out.println(array[index]);
		}
	}
}
