
public class UnaryOperatorsDemo {

	public static void main(String[] args) {
		
		int a = 10;		
		int b = a++;
		
		// b = 10
		// a + 1 [IC]
		// a = [IC]
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 15;
		int d = ++c;
		
		// c + 1 [IC]
		// c = 16 [IC]
		// d = 16
		
		System.out.println(c);
		System.out.println(d);
	}
}
