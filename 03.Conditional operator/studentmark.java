import java.util.Scanner;
public class studentmark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of amount:");
        int mark = sc.nextInt();
        if (mark>=35) {
            System.out.println("student is passed");
            if (mark>=75) {
                System.out.println("student got distinction");
            }
        } else {
            System.out.println("student id failed");
        }
    }
}