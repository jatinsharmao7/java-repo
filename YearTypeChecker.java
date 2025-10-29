import java.util.Scanner;

public class YearTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean isCentury = (year % 100 == 0);
        
        if (isLeap && isCentury) {
            System.out.println("Leap Century Year");
        } else if (isLeap) {
            System.out.println("Leap Year");
        } else if (isCentury) {
            System.out.println("Century Year");
        } else {
            System.out.println("Ordinary Year");
        }
        
        sc.close();
    }
}
