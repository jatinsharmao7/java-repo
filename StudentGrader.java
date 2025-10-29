import java.util.*;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int s1, s2, s3, s4, s5;
        System.out.print("Enter marks of Subject 1: ");
        s1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        s2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        s3 = sc.nextInt();
        System.out.print("Enter marks of Subject 4: ");
        s4 = sc.nextInt();
        System.out.print("Enter marks of Subject 5: ");
        s5 = sc.nextInt();

        
        if (s1 < 40 || s2 < 40 || s3 < 40 || s4 < 40 || s5 < 40) {
            System.out.println("Grade: Fail");
        } else {
            
            double average = (s1 + s2 + s3 + s4 + s5) / 5.0;

            
            if (average >= 90) {
                System.out.println("Grade: A+");
            } else {
                if (average >= 75) {
                    System.out.println("Grade: A");
                } else {
                    if (average >= 60) {
                        System.out.println("Grade: B");
                    } else {
                        if (average >= 40) {
                            System.out.println("Grade: C");
                        } else {
                            System.out.println("Grade: Fail");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
