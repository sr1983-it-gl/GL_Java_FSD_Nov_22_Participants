
public class StarPrinterRightTriangleV2 {

	public static void main(String[] args) {
		
		int noOfTimes = 5;
		boolean printStar = true;
		
		for (int indexForLineOfStars = 1; 
				indexForLineOfStars <= noOfTimes; 
					indexForLineOfStars ++ ) {
			
			
			for (int indexWithinLineOfStars = 1; 
					indexWithinLineOfStars <= noOfTimes; 
						indexWithinLineOfStars ++) {

				int tempValue = (noOfTimes - indexForLineOfStars);

				if (indexWithinLineOfStars <= tempValue) {
					printStar = false;
				}else {
					printStar = true;
				}
				
				if (printStar) {
					System.out.print("*");	
					System.out.print(" ");					
				}else {
					System.out.print(" ");	
					System.out.print(" ");										
				}
			}
			
			System.out.println();
		}
		
	}
}
