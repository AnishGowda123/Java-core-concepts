import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args){
        int number=123321;
        int reverse=0;
        int last_digit;
        while(number!=0){
            last_digit=number%10;
            reverse=reverse*10+last_digit;
            number=number/10;
        }
        System.out.println("the reverse form of number= "+reverse);
    }
}