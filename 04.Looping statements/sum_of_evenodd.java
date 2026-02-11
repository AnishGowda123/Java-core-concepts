public class sum_of_evenodd {
    public static void main(String[] args) {
        int even_sum=0;
        int odd_sum=0;

        for (int i = 1; i <= 10; i++) {

            if (i%2==0) {
                even_sum=even_sum+i;
            } else {
                odd_sum=odd_sum+i;
            }
        }
        System.out.println("sum of even numbers= "+even_sum);
        System.out.println("sum of odd numbers= "+odd_sum);
    }
}
