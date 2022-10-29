
public class SwitchFoodMenuWithDefaultDemo {


	public static void main(String[] args) {
		
		
//		System.out.println("1. Burgers");
//		System.out.println("2. Juices");
//		System.out.println("3. Cakes");
		
		int userOption = 1; // 2// 3
		
		switch (userOption) {
		
			case 1: {
				
				System.out.println("Lola Burger");
				System.out.println("veg Burger");
				
				break;
			}
				
			case 2: {
				
				System.out.println("Apple Juice");
				System.out.println("Ornage Juice");
				
				break;
			}
				
				
			case 3: {
				
				System.out.println("Black Forrest");
				System.out.println("Eggless Cake");
				
				break;
			}
			
			default: {
				
				System.out.println("Incorrect user option. The valid values are 1 / 2 / 3");
				break;
			}
		
		}
		
	}
}
