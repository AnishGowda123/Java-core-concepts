public class tables_5 {
    public static void main(String[] args) {
        int num=1;
        int i=1;
        while (num<=50) {
            if (num%5==0) {
                System.out.println("5X"+i+"="+num);   
                 i++;
            }
            num++;  
        }
    }
}
