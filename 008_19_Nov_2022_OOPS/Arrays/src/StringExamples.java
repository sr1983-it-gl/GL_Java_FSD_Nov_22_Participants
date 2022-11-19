
public class StringExamples {

	public static void main(String[] args) {
		
		String java = "Java";
		String java17 = new String("Java 17");
		
		char charArray[] = {'J', 'a', 'v', 'a'};
		
		String javaThroughCharArray = new String(charArray);
		
		System.out.println(java);
		System.out.println(java17);
		System.out.println(charArray);
		System.out.println(javaThroughCharArray);
		
	}
}
