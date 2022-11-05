
public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int counter = 100;
		
		boolean condition = (counter <= 10);
		
		while (condition) {
			
			System.out.println("Demo of while Loop - counter " + counter);
			
			counter = counter + 1;
		}
	}
}
