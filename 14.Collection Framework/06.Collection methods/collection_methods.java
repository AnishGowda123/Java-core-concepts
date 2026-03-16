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
        System.out.println("--------------------");// add() method
        ArrayList a1 = new ArrayList();
        a1.addAll(a);
        System.out.println(a1);
        System.out.println("--------------------");// addAll() method
        a1.remove("panish");
        System.out.println(a1);
        System.out.println("--------------------");// remove() method
        a1.removeAll(a1);
        System.out.println(a1);
        System.out.println("--------------------");// removeAll() method
        a1.retainAll(a);
        System.out.println(a1);
        System.out.println("--------------------");// retainAll() method
        a1.addAll(a);
        System.out.println(a1);
        System.out.println("--------------------");
        a1.clear();//--------------------------------// clear() method
        a1.addAll(a);
        a1.add("panish");
        System.out.println(a1);
        System.out.println("--------------------");
        System.out.println(a.size());
        System.out.println("--------------------");// size() method
        System.out.println(a.isEmpty());
        System.out.println("--------------------");// isempty() method
        System.out.println(a1.isEmpty());
        System.out.println("--------------------");
        System.out.println(a.contains("anish"));
        System.out.println("--------------------");// contains() method
        System.out.println(a1.containsAll(a));
        a.toArray();
        System.out.println(a);
    }
}
