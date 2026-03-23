import java.util.LinkedHashMap;

public class linkedhashmap_2 {
    public static void main(String[] args) {
        LinkedHashMap l = new LinkedHashMap();// HashMap h = new HashMap();
        l.put(10, 2.25);
        l.put("java", null);
        l.put(52.526, "non");
        l.put(null, 10);
        System.out.println(l);
        LinkedHashMap l1 = new LinkedHashMap(l);// HashMap h = new HashMap(Map m);
        System.out.println(l1);


    }
}
