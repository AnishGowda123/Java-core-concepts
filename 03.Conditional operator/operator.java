import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        char ch = '?';
        int a= 10;
        int b= 20;
        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                 System.out.println(a-b);
                break;
            case '*':
                 System.out.println(a*b);
                break;
            case '/':
                 System.out.println(a/b);
                break;
            default:
                 System.out.println(a+","+b);
                break;
        }
    }
}