import java.util.HashMap;

public class ContainValue {
    public static void main(String[] args) {
         HashMap m = new HashMap<>();
        m.put(10, "java");
        m.put("mapping", 20.25);
        m.put(null, null);
        m.put(1.2, "python");
        m.put("code", null);
        m.put(null, 10);
        System.out.println(m);
        System.out.println("---------------------------");
        System.out.println(m.containsValue(101));
        System.out.println(m.containsValue("python"));
        System.out.println(m.containsValue(20.25));
    }
}
