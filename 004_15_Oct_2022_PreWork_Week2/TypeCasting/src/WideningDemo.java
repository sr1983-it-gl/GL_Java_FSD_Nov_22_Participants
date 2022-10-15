
public class WideningDemo {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		
		short shortValue = 200;
		
		int intValue = 30000;
		
		long longValue = 678_567_123L;
		
		// Valid -> Widening
		longValue = intValue;
		
		// Valid -> Widening
		intValue = shortValue;
		
		// Valid -> Widening
		shortValue = byteValue;
		
	
		// No Widening
		byteValue = shortValue;
				
	}
}
