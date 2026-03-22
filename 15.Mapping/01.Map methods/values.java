import java.util.Collection;
import java.util.HashMap;

public class values {
    public static void main(String[] args) {
        HashMap m = new HashMap<>();
        m.put(10, "java");
        m.put("mapping", 20.25);
        m.put(null, null);
        m.put(1.2, "python");
        m.put("code", null);
        m.put(null, 10);
        System.out.println(m);
        System.out.println("------------------");
       Collection m1= m.values();
        System.out.println(m1); 
    }
      
}
