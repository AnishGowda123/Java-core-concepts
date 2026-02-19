public class checked_exception {
    public static void main(String[] args) {
        try {
            Class.forName("demo.p1");//fully qualified path
        } catch (Exception e) {
            System.out.println("given class is not found in inserted package!!!!");
        }
    }
}
