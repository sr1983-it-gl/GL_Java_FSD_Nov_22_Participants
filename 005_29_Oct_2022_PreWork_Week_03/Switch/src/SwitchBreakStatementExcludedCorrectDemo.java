
public class SwitchBreakStatementExcludedCorrectDemo {

	public static void main(String[] args) {
		
		/*
		 * 1 Monday
		 * 2 Tuesday
		 * 3 Wed
		 * 4 Thurs
		 * 5 Friday
		 * 6 Saturday
		 * 7 Sunday
		 */
		
		int dayOfWeek = 6;
		
		switch (dayOfWeek) {
		
		case 1: {
			
		}
		
		case 2: {
			
		}
		
		case 3 : {}
		
		case 4 : {}
		
		case 5 : {
			System.out.println("Weekday");
			break;
		}
		
		case 6 : {}
		
		case 7 : {
			System.out.println("Weekend");
			break;
		}
		
		default : {
			
			System.out.println("Valid values are from [1-7]");
		}
			
		}
	}
}
