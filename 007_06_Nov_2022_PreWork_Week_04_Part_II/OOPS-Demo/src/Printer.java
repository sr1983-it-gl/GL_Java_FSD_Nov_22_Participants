
class Printer {

	// Section [Properties /  Attributes]
	String model;
	float price;
	boolean colorPrintingSupported;	
	
	/*
	 * how the printer works
	 * 1000 lines
	 */
	
	// Section [Methods]
	// Success
	// Failure [10 -> NOT]	
	// Partial Success [5 -> PRINTED, ]
	void printDocument(File file){
		
	}
	
	void switchOn() {
		
		
	}
	
	void switchOff() {
		
	}
	
	void display() {
		
		System.out.println("Model is " + model);
		System.out.println("Pricce is " + price);
		System.out.println("Color printing supported ?" + colorPrintingSupported);
	}
}
