package hust.soict.globalict.lab01.equationsolver;
import java.util.Scanner;
import hust.soict.globalict.lab01.equationsolver.firstdegreeequation.FirstDegreeEquation;
import hust.soict.globalict.lab01.equationsolver.seconddegreeequation.SecondDegreeEquation;
import hust.soict.globalict.lab01.equationsolver.systemfirstdegreeequations.SystemFirstDegreeEquations;

public class EquationSolverTest {
	
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			
			int choice;

			System.out.println("Welcome to Calculator!");
			System.out.println("Choose a type of problem: ");
			System.out.println("1. First Degree Equation");
			System.out.println("2. Second Degree Equation");
			System.out.println("3. First Degree Equation System");

			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				double x, y;
				FirstDegreeEquation firstDegreeEquation = new FirstDegreeEquation();
				
				System.out.print("a = ");
				x = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("b = ");
				y = scanner.nextDouble();
				scanner.nextLine();
				
				try {
					System.out.printf("Root of the equation: %f\n", firstDegreeEquation.calculateRoot(x, y));
				} catch(Exception e) {
					System.out.println(e);
				}
				
				break;
			case 2:
				double a, b, c, root1, root2;
				SecondDegreeEquation secondDegreeEquation = new SecondDegreeEquation();
				
				System.out.print("a = ");
				a = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("b = ");
				b = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("c = ");
				c = scanner.nextDouble();
				scanner.nextLine();
				
				try {
					secondDegreeEquation.calculateRoot(a, b, c);
					root1 = secondDegreeEquation.getX();
					root2 = secondDegreeEquation.getY();
					
					if (root1 == root2) {
						System.out.printf("The equation has 1 solution: x = %f\n", root1);
					} else {
						System.out.printf("The equation has 2 solutions: x = %f and x = %f\n", root1, root2);
					}
				} catch(Exception e) {
					System.out.println(e);
				}
				
				break;
			case 3:
				double a1, b1, c1, a2, b2, c2, resultX, resultY;
				SystemFirstDegreeEquations systemFirstDegreeEquations = new SystemFirstDegreeEquations();
				
				System.out.println("Input for the first equation:");
				System.out.print("a = ");
				a1 = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("b = ");
				b1 = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("c = ");
				c1 = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("Input for the second equation:");
				System.out.print("a = ");
				a2 = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("b = ");
				b2 = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("c = ");
				c2 = scanner.nextDouble();
				scanner.nextLine();
				
				try {
					systemFirstDegreeEquations.calculateRoot(a1, b1, c1, a2, b2, c2);
					resultX = systemFirstDegreeEquations.getX();
					resultY = systemFirstDegreeEquations.getY();
					
					System.out.printf("The equation has 1 solution: x = %f, y = %f\n", resultX, resultY);
				} catch(Exception e) {
					System.out.println(e);
				}
		
				break;
			}
			
			return;
		}

	}
	
}