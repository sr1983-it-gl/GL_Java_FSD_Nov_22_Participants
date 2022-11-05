
public class ContinueStatementUsage {

	public static void main(String[] args) {
		
		
		for (int counter = 1; counter <=6; counter ++) {
			
			if (counter == 6) {
				
//				break;
				continue;
			}
			
			System.out.println("Processing STARTED for counter " + counter);
			
			System.out.println("Processing DONE for counter " + counter);
		}
	}
}
