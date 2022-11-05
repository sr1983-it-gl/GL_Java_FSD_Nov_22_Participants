
public class StarPrinterLeftTriangleV3 {

	public static void main(String[] args) {
		
		int noOfTimes = 7;
		
		for (int indexForLineOfStars = 1; 
				indexForLineOfStars <= noOfTimes; 
					indexForLineOfStars ++ ) {
			
			int uptoIndex = indexForLineOfStars;
			for (int indexWithinLineOfStars = 1; 
					indexWithinLineOfStars <= uptoIndex; 
						indexWithinLineOfStars ++) {
				System.out.print("*");	
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
}
