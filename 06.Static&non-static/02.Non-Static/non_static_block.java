public class non_static_block {
    {
        System.out.println("non-static block 1");
    }
    public static void main(String[] args) {
        non_static_block ob = new non_static_block();
        System.out.println("main block");
    }
    {
        System.out.println("non-static block 2");
    }
}
