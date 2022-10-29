import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
//		input.hasNextL
		boolean isAnIntegerValue = input.hasNextInt();
		
		if (isAnIntegerValue) {

			int someInteger = input.nextInt();
			
			System.out.println("You entered " + someInteger);

		}else {
			System.out.println("You are expected to enter an interger..");
		}
		
	}
}
