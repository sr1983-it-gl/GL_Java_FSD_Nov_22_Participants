
public class ArrayExample1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for (int index = 0; index < a.length; index ++) {
			
			int element = a[index];
			int newValue = element + 10;
			a[index] = newValue;
			
			
			System.out.println(element + " -> " + a[index]);
		}
	}
}
