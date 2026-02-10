import java.util.Scanner;

public class Smallest_number {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of a:");
         int a = sc.nextInt();
         System.out.println("Enter the value of b:");
         int b = sc.nextInt();

          if (a<b) {
            System.out.println(a+" is a smallest number");
        } else {
            System.out.println(b+" is a largest number");      
        }
    }
}