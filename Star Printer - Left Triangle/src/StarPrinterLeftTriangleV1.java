
public class StarPrinterLeftTriangleV1 {

	public static void main(String[] args) {
		
		int noOfTimes = 5;
		
		for (int outerIndex = 1; outerIndex <= noOfTimes; outerIndex ++ ) {
			
			for (int index = 1; index <= noOfTimes; index ++) {
				System.out.print("*");	
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
}
