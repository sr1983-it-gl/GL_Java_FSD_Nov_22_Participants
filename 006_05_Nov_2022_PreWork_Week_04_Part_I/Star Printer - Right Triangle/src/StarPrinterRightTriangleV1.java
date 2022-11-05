
public class StarPrinterRightTriangleV1 {

	public static void main(String[] args) {
		
		int noOfTimes = 5;
		
		for (int indexForLineOfStars = 1; 
				indexForLineOfStars <= noOfTimes; 
					indexForLineOfStars ++ ) {
			
			for (int indexWithinLineOfStars = 1; 
					indexWithinLineOfStars <= noOfTimes; 
						indexWithinLineOfStars ++) {
				System.out.print("*");	
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
}
