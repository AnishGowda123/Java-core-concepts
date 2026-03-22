import java.util.LinkedHashMap;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap l = new LinkedHashMap();
        l.put(10, 2.25);
        l.put("java", null);
        l.put(52.526, "non");
        l.put(null, 10);
        System.out.println(l);
    }
}
