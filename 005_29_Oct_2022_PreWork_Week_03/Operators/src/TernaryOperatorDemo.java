
public class TernaryOperatorDemo {

	public static void main(String[] args) {

		
		
		int a = 200;
		
		int b = 50;
		
		if (a > b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
		
		int largeNumber = (a > b) ? a : b;
		System.out.println("Large Number is " + largeNumber);
		
		int smallNumber = (a < b) ? a : b;
		System.out.println("Small Number is " + smallNumber);
		
		int c = 30;
		int d = 40;
		
		int finalValue = (a < b) ? ( c < d ? c : d) : (c > d ? d : c);
		
	}
}
