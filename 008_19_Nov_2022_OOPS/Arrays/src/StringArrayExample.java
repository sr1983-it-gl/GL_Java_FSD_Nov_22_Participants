
public class StringArrayExample {

	public static void main(String[] args) {
		
		String[] helloMessage = new String[5];
		
		helloMessage[0] = "Hello";
		helloMessage[1] = "Hi";
		helloMessage[2] = "l";
		helloMessage[3] = "l";
		helloMessage[4] = "0";
		
		for (int index = 0; index < helloMessage.length; index ++) {
			
			String value = helloMessage[index];
			System.out.println(value);
		}
	}
}
