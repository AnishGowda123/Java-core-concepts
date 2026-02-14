import java.util.Scanner;

public class ranks_student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the marks of abhi:");
         int abhi_marks = sc.nextInt();
         System.out.println("Enter the value of ram:");
         int ram_marks= sc.nextInt();
         System.out.println("Enter the value of sam:");
         int sam_marks = sc.nextInt();

         
        if (abhi_marks>ram_marks && abhi_marks>sam_marks) {
            System.out.println("abhi is a First rank");
            if (abhi_marks>=85) {
                System.out.println("he got Distinction");
            }
            else if (abhi_marks>=75) {
                System.out.println("he got First-class"); 
            } else {
                System.out.println("He got second-class");
            }
        } 
        else if (ram_marks>sam_marks) {
            System.out.println("ram is a First rank"); 
            if (ram_marks>=85) {
                System.out.println("he got Distinction");
            }
            else if (ram_marks>=75) {
                System.out.println("he got First-class"); 
            } else {
                System.out.println("He got second-class");
            }
        } else {
            System.out.println("sam is a First rank");
            if (sam_marks>=85) {
                System.out.println("he got Distinction");
            }
            else if (sam_marks>=75) {
                System.out.println("he got First-class"); 
            } else {
                System.out.println("He got second-class");
            }
        }
    }
}
