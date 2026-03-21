import java.util.HashMap;

public class size {
    public static void main(String[] args) {
         HashMap m = new HashMap<>();
        m.put(10, "java");
        m.put("mapping", 20.25);
        m.put(null, null);
        m.put(1.2, "python");
        m.put("code", null);
        m.put(25, 10);
        System.out.println(m);
        System.out.println("---------------------------");
        System.out.println(m.size());
    }
}
