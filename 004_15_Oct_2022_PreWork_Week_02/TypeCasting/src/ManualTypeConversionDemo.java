
public class ManualTypeConversionDemo {

	public static void main(String[] args) {
		
		double d1 = 100.50D;
		
		double d2 = 20.75D;
		
		int result = (int)(d1 / d2);
		System.out.println(result);
		
		
		long l1 = 123;
		
		short s1 = (short)l1;
				
		System.out.println(s1);
		
		long l2 = 1234_56789L;
		short s2 = (short)l2;
		
		System.out.println(s2);
		
		byte b1 = 66;
		char c1 = (char)b1;
		
		byte b3 = 100;
		short s3 = b3;
		
		System.out.println(c1);
		
		char c = 'C';
		int i1 = c;
		
		int i2 = 1000;
		char c2 = (char)i2;
		
		double average = 44.44D;
		
		int intAverage = (int)average;
		
		char c4 = 'D';
		byte b4 = 100;
		
		c4 = (char)b4;
		c4 = b4;
		
	}
}
