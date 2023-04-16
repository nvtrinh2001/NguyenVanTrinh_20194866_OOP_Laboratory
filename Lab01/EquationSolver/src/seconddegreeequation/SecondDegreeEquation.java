package seconddegreeequation;

import java.lang.Math;

public class SecondDegreeEquation {
	
	private double x;
    private double y;

    public void MyResult(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
	
	double discriminant(double a, double b, double c) {
		return b*b - 4*a*c;
	}

	public void calculateRoot(double a, double b, double c) {
		
		if (a == 0) {
			throw new ArithmeticException("a cannot be 0");
		}
		
		double discriminant = discriminant(a, b, c);
		
		if (discriminant > 0) {
			
			x = (-b + Math.sqrt(discriminant)) / (2*a);
			y = (-b - Math.sqrt(discriminant)) / (2*a);
			
		} else if (discriminant == 0) {
			
			x = (-b) / (2*a);
			y = x;
			
		} else {
			throw new ArithmeticException("no solution");
		}
		
	}
	
}
