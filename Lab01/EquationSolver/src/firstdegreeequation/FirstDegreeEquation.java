package firstdegreeequation;

public class FirstDegreeEquation {
	
	public double calculateRoot(double a, double b) {

		if (a == 0) {
			throw new ArithmeticException("a cannot be 0");
		}
		
		return -b / a;
		
	}
	
}
