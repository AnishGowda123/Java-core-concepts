import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap m = new HashMap();// HashMap h = new HashMap();
        m.put(10, "java");
        m.put("mapping", 20.25);
        m.put(null, null);
        m.put(1.2, "python");
        m.put("code", null);
        m.put(null, 10);
        System.out.println(m);
        System.out.println("*-------------------------------------------*");
        HashMap m1 = new HashMap(m);// HashMap h = new HashMap(Map m);
        System.out.println(m1);
    }
}
