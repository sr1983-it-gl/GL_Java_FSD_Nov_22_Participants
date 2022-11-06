
public class OOPSDemo {

	public static void main(String[] args) {
		
		// Scenario
		// Printer printer-03 printing the document java-crash-course-pdf
		// java_crash_course wants to print itself
		
		/**
		 * Objects / Nouns
		 * 	printer-03 [printer01, printer02, printer04]
		 *  java-crash-course-pdf [harry-potter-book-pdf, scriptMovie-interstellar-pdf]
		 */
		
		/**
		 * Category / Class
		 * 	Printer [printer-01, printer02]
		 *  File [java-crash-pdf, harry-potter-nove-pdf]
		 */
		
		/**
		 * Action / Task  / Verb
		 * 	print_the_document
		 * 	switchOn
		 * 	switchOff
		 * 	upgradeDeviceSoftware
		 */
		
		/**
		 * Primary Object - Initiate the action
		 * printer-03
		 *
		 */
		
		
		/*
		 * Dependent Elements / Dependent Objects / Pre-requisite
		 * 	Dependent Element - 1
		 * 		java-crash-course-pdf
		 */
		
		/*
		 * Format
		 * primary_object.action_name(dependent_object1, dependent_object2, ...)
		 * 
		 */
		
//		String printer_05;
//		
//		String java_crash_course_pdf;
		
//		int maryAge = new int();

		int maryAge = 25;
		
		
		// Laptop
		// manufactureName
		// modelName
		// touchScreenSupport
		// cost
		
		Printer printer_03;
		// Model = "HP Deskjet 6789"
		// Price = 10000
		// colorPrintingSupported = true
		
		
		File java_crash_course_pdf = new File();
		java_crash_course_pdf.title = "Learn Java in 25 days";
		java_crash_course_pdf.noOfPages = 70;
		
		// title = ""
		// noOfPages = 70
		
		File sqlPdf = new File();
		
		// title = "SQL programming - Advanced Level"
		// noOfPages = 100
		
		Printer printer_05 = new Printer();		
		
		// Attributes
		printer_05.model = "HP Deskjet 12345";
		printer_05.price = 7000;
		printer_05.colorPrintingSupported = false;

		// Methods
		printer_05.printDocument(java_crash_course_pdf);
		
		printer_05.display();
		
		// Create a custom data type
		// For whatever category that the object/data belong to, create a class
		// Guidline
			// Take the name from the Category
	
		// launch the rocket to moon
	
		int age = 25;
		
		Printer printer1 = new Printer(); 
		// allocate the necessary memory for printer1 object
		
	}
	
	void test() {
		
//		maryAge = 25;
		
		int maryAge = 25;
		
		float johnSalary = 10233;
		
		int noOfPeopleInFamily = 10;
		
	}
}
