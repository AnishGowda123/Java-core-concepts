public class palindrome {
       public static void main(String[] args){
        int number=123321;
        int temp=number;
        int reverse=0;
        int last_digit;
        while(number!=0){
            last_digit=number%10;
            reverse=reverse*10+last_digit;
            number=number/10;
        }
        if (temp==reverse) {
            System.out.println("it's a palidrome");
        }
        else{
            System.out.println("it's not a palidrome");
        }
    }
}