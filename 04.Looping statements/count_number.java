import java.util.Scanner;

public class count_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("enter a number:");
        int count =0;
        while (number!=0) {
            number=number/10;
            count++;
        }
        System.out.println("the total number is digit= "+count);
    }
}
