public class widening_02 {
    public static void main(String[] args) {
        int apple = 10;
        int banana = apple;
        int grape = banana;
        System.out.println(apple);
        System.out.println(banana);
        System.out.println(grape);
        int total =  apple + banana +grape;
        System.out.println("total price of fruit is: "+ total);
    }
}
