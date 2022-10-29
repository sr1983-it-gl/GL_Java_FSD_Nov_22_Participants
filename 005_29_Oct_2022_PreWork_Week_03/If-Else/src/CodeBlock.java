
public class CodeBlock {

	public static void main(String[] args) {
		
		int a = 10;
		
		if (a == 10) {
			
			System.out.println("Condition has passed");
			System.out.println("A's value is 10");
		}
		
		
		{
			int b = 20;
			System.out.println("B's value is " + b);
		}
		
//		System.out.println(b);
	}
}
