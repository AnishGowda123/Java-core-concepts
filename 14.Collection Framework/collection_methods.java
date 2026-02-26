import java.util.ArrayList;
import java.util.Arrays;

public class collection_methods {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("anish");
        a.add("manish");
        a.add("tanish");
        a.add("zanish");
        a.add("panish");
        System.out.println(a);
        System.out.println("--------------------");
        ArrayList a1 = new ArrayList();
        a1.addAll(a);
        System.out.println(a1);
        System.out.println("--------------------");
        a1.remove("panish");
        System.out.println(a1);
        System.out.println("--------------------");
        a1.removeAll(a1);
        System.out.println(a1);
        System.out.println("--------------------");
        a1.retainAll(a);
        System.out.println(a1);
        System.out.println("--------------------");
        a1.addAll(a);
        System.out.println(a1);
        System.out.println("--------------------");
        a1.clear();
        a1.addAll(a);
        a1.add("panish");
        System.out.println(a1);
        System.out.println("--------------------");
        System.out.println(a.size());
        System.out.println("--------------------");
        System.out.println(a.isEmpty());
        System.out.println("--------------------");
        System.out.println(a1.isEmpty());
        System.out.println("--------------------");
        System.out.println(a.contains("anish"));
        System.out.println("--------------------");
        System.out.println(a1.containsAll(a));
        a.toArray();
        System.out.println(a);
    }
}
