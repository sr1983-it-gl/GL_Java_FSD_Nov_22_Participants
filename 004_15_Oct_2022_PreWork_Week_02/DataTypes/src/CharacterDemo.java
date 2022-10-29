
public class CharacterDemo {

	public static void main(String[] args) {
		
		char alphabet = 'A';
		
		System.out.println(alphabet);
		
		int tempInt = (int)alphabet;
		
		System.out.println(tempInt);
		
		tempInt = tempInt + 2;
		
		alphabet = (char)tempInt;
		System.out.println(alphabet);
		
	}
}
