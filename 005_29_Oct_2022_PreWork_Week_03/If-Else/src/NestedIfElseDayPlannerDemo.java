
public class NestedIfElseDayPlannerDemo {

	
	public static void main(String[] args) {
		
		
		String dayOfWeek = "Sunday";
		
		// Weekend Check
		if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
			
			// Weekend
			
			if (dayOfWeek.equals("Saturday")) {
				System.out.println("Plan for a movie...");
			}else {
				
				System.out.println("Relax at home...");
			}
			
		}else {
			
			if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Thursday")) {
				System.out.println("Go to gym..");
			}else {
				
				System.out.println("Some other planning...");
			}
			
			// Weekday
		}
		
	}
}
