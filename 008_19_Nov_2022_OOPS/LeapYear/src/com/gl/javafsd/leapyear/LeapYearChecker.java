package com.gl.javafsd.leapyear;

 class LeapYearChecker {

	int year;
	
	public LeapYearChecker(int year) {
		this.year = year;
	}

	public LeapYearChecker(int[] years) {
		this.year = year;
	}

	public void check() {
		
		boolean leapYear = false;
		boolean divisibleBy4 = false;
		boolean centuryYear = false;
		String centuryYearDivisibleBy400 = "N/A";
		
		if (year % 4 == 0) {
			
			divisibleBy4 = true;
			
			// Century year check
			if (year % 100 == 0) {
				
				centuryYear = true;
				
				if (year % 400 == 0) {
					
					centuryYearDivisibleBy400 = "true";
					leapYear = true;
				}else {
					
					centuryYearDivisibleBy400 = "false";
					leapYear = false;
				}
			}else {
				
				centuryYear = false;
				leapYear = true;
			}
			
		}else {
			
			divisibleBy4 = false;
			leapYear = false;
		}
		
		// "For year" + year + "[Divisible by 4 : " + 
		//
		// INT -> %d, STRING %s, BOOLEAN %b, FLOAT %f
		String messageTemplate 
			= "For year %d [Divisible By 4 : %b, Century Year : %b" +
			", Century year Divisible By 400 : %s] -> Leap year %b";
		
		String message = 
		String.format(messageTemplate, 
				year, divisibleBy4, centuryYear, centuryYearDivisibleBy400, leapYear);
		
		System.out.println(message);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		LeapYearChecker checker1 = new LeapYearChecker(2000);
		checker1.check();
		
		LeapYearChecker checker2;
		checker2 = new LeapYearChecker(1993);
		checker2.check();
		
	}
}
