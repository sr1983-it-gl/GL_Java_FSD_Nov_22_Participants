import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your first name: ");
		String firstName = scanner.nextLine();
		
		System.out.println("Your last name: ");
		String lastName  = scanner.nextLine();
		
		
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : "  + lastName);
		
		String fullName = firstName + " " + lastName;
		System.out.println("Full Name : " + fullName );
		
		scanner.close();
	}
}
