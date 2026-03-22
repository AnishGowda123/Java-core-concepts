import java.util.HashMap;

public class clear {
    public static void main(String[] args) {
         HashMap m = new HashMap<>();
        m.put(10, "java");
        m.put("mapping", 20.25);
        m.put(null, null);
        m.put(1.2, "python");
        m.put("code", null);
        m.put(null, 10);
        System.out.println(m);
        HashMap m1 = new HashMap<>();
        m1.putAll(m);
        System.out.println(m1);
        m1.clear();
        System.out.println(m1);  
    }
}
