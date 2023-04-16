import java.util.Scanner;
import doublecalculator.DoubleCalculator;   

public class Main {
	
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			
			double x, y;
			int choice;
			DoubleCalculator doubleCalculator = new DoubleCalculator();

			System.out.println("Welcome to Calculator!");
			
			System.out.print("x = ");
			x = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.print("y = ");
			y = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.print("Choose a operator - 0(+), 1(-), 2(*), 3(/): ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				System.out.printf("%f + %f = %f\n", x, y, doubleCalculator.add(x, y));
				break;
			case 1:
				System.out.printf("%f - %f = %f\n", x, y, doubleCalculator.substract(x, y));
				break;
			case 2:
				System.out.printf("%f * %f = %f\n", x, y, doubleCalculator.multiply(x, y));
				break;
			case 3:
				double result = 0;
				try {
					result = doubleCalculator.divide(x, y);
					System.out.printf("%f / %f = %f\n", x, y, result);
				} catch(Exception e) {
					System.out.println(e);
				}
		
				break;
			}
			
			return;
		}

	}
	
}
