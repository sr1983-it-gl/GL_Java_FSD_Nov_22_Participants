
public class AutomaticTypeConversionIncompatabileDataTypes {

	public static void main(String[] args) {
		
		boolean someCondition = false;
		
		float f1 = someCondition;
		
		double d1 = 1.23D;
		
		char c1 = d1;
	}
}
