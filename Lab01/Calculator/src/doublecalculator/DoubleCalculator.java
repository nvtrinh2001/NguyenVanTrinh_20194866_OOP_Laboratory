package doublecalculator;

public class DoubleCalculator {

	public double add(double x, double y) {

		return x + y;
		
	}
	
	public double substract(double x, double y) {

		return x - y;
		
	}

	public double multiply(double x, double y) {

		return x * y;
		
	}
	
	public double divide(double x, double y) {
		
		if (y == 0) {
			throw new ArithmeticException("cannot divide by zero");
		}

		return x / y;
		
	}
	
}
