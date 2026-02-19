import java.util.Scanner;

public class throw_keyword2 {
     public static void main(String[] args) {
        int marks=89;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code:");
        int pass = sc.nextInt();

        if (marks<=pass) {
            System.out.println("student is passed>>>");
        } else {
            System.out.println("better luck next time:)");
             throw new ArithmeticException();
        }

    }
}
