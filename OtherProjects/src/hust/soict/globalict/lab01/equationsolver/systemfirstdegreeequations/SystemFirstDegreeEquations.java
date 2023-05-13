package hust.soict.globalict.lab01.equationsolver.systemfirstdegreeequations;

public class SystemFirstDegreeEquations {
	
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
	
	double calculateDelta(double a, double b, double c, double d) {
		
		return a * b - c * d;
		
	}
	
	public void calculateRoot(double a1, double b1, double c1, double a2, double b2, double c2) {
		
		double delta = calculateDelta(a1, b2, a2, b1);
		double deltaX = calculateDelta(c1, b2, c2, b1);
		double deltaY = calculateDelta(a1, c2, a2, c1);
		
		if (delta != 0) {
			this.x = deltaX / delta; 
			this.y = deltaY / delta;
			return;
		}
		
		if (deltaX == 0 && deltaY == 0) {
			throw new ArithmeticException("infinite solutions");
		}
		
		throw new ArithmeticException("no solution");
		
	}
	
}
