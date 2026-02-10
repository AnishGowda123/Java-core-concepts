import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        String country = "India";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the voter age");
        int age = sc.nextInt();
        if (age>=18) {
            if (country=="India") {
                System.out.println("eligble for voting");
            }
        } else {
            System.out.println("not eligible");
        }
    }
}