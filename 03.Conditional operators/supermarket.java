import java.util.Scanner;
public class supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of amount:");
        int amount = sc.nextInt();
        if (amount>=10000) {
            System.out.println("70% for the products");  
        }
        else if (amount>=7000) {
            System.out.println("40% for the products"); 
        }
        else if (amount>=3000) {
            System.out.println("20% for the products"); 
        }else if (amount>=1000) {
            System.out.println("10% for the products");   
        } else {
            System.out.println("sorry,NO DISCOUNT FOR YOUR ITEMS");
        }
    }   
}