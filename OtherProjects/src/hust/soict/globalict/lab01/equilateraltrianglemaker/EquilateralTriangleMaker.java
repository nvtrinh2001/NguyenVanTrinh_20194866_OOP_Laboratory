package hust.soict.globalict.lab01.equilateraltrianglemaker;
import java.util.Scanner;

public class EquilateralTriangleMaker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();
        
        // for each row
        for (int i = 0; i < n; i++) {
            
            // the space in the left of each row is equal to
        	// the subtraction of the number of rows and the
        	// number of rows that has been iterated
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            
            // each row will have the number of stars based on
            // a formula: row[i] = 2 * i + 1
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            
            // move to the next row
            System.out.println();
        }
        
        scanner.close();
    }
}