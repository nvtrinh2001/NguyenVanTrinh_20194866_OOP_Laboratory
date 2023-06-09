package hust.soict.globalict.lab01.daysofamonthdisplay;
import java.util.Scanner;

public class DaysOfAMonthDisplay {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a month (e.g. January, Jan., Jan, 1): ");
        String monthInput = scanner.nextLine();
        System.out.print("Enter a year (e.g. 1999): ");
        int yearInput = scanner.nextInt();
        
        // normalize and check month input
        int month = 0;
        switch (monthInput.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                month = 1;
                break;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                month = 2;
                break;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                month = 3;
                break;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                month = 4;
                break;
            case "may":
            case "5":
                month = 5;
                break;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                month = 6;
                break;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                month = 7;
                break;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                month = 8;
                break;
            case "september":
            case "sep.":
            case "sep":
            case "9":
                month = 9;
                break;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                month = 10;
                break;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                month = 11;
                break;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                month = 12;
                break;
            default:
                System.out.println("Invalid month input. Try again!");
                main(args);
                scanner.close();
                return;
        }
        
        // check year input
        if (yearInput < 0) {
            System.out.println("Invalid year input. Try again!");
            main(args);
            scanner.close();
            return;
        }
        
        // leap year?
        boolean isLeapYear = false;
        if (yearInput % 4 == 0) {
            if (yearInput % 100 == 0) {
                if (yearInput % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        
        // get the month's number of days
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
            	days = isLeapYear ? 29 : 28; 
        }
        
        System.out.printf("In %s %d, there are %d days.\n", monthInput, yearInput, days);
        
        scanner.close();
        return;
    }
}
