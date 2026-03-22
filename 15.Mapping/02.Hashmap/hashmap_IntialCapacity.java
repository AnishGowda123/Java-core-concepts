import java.util.HashMap;

public class hashmap_intCap {
    public static void main(String[] args) {
        HashMap m2 = new HashMap(2);// HashMap h = new HashMap(int intialCapacity);
        m2.put(10, 1.5);
        m2.put(1.2, "python");
        System.out.println(m2);
    }
}
