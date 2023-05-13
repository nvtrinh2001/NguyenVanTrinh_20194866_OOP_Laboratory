package hust.soict.globalict.lab01.array;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // sort the array in ascending order
        Arrays.sort(numbers);
        
        // print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // print the sum of the array elements
        System.out.println("Sum of array elements: " + sum);
        
        // calculate the average of the array elements
        double average = (double) sum / numbers.length;
        
        // print the average of the array elements
        System.out.println("Average of array elements: " + average);
        
    }
    
}
