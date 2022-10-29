import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter some text");
		
		String collectedInput = input.nextLine();
		
		System.out.println("Input entered is " + collectedInput);
	}
}
