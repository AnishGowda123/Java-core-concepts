import java.util.Scanner;

public class throw_keyword {
    public static void main(String[] args) {
        int pin=2003;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code:");
        int code = sc.nextInt();

        if (pin==code) {
            System.out.println("code decoded successfully>>>");
        } else {
            System.out.println("please enter the valid code:)");
             throw new ArithmeticException();
        }

    }
}
