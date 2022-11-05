
public class FactorialDemo {

	public static void main(String[] args) {
		
		int number = 5;
		
		int previousValueResult = 1;
		int iterationResult = 1;

		for (int index = number; index >= 1; index --) {
			
//			System.out.println(index);
			
			int currentValue = index;
//			
			iterationResult = currentValue * previousValueResult;
//			
			previousValueResult = iterationResult;
		}
		
		System.out.println("Factorial of the number (" + number 
				+ ") is " + iterationResult);
	}
}
