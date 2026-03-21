import java.util.HashMap;

public class remove {
    public static void main(String[] args) {
         HashMap m = new HashMap<>();
        m.put(10, "java");
        m.put("mapping", 20.25);
        m.put(null, null);
        m.put(1.2, "python");
        m.put("code", null);
        m.put(null, 10);
        System.err.println(m);
        System.out.println("---------------------------");
        m.remove(10);
        m.remove("code");
         System.err.println(m);
    }
}
