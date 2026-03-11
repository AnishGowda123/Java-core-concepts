import java.util.ArrayList;

public class list_method {
    public static void main(String[] args) {
       ArrayList a = new ArrayList();
        a.add("anish");
        a.add("manish");
        a.add("tanish");
        a.add("zanish");
        a.add("panish");
        a.add(2, "XOX");
        a.add(1, "YOY");
        System.out.println(a); 
        System.out.println("--------------------");// add()
        ArrayList a1 = new ArrayList(a);
        System.out.println(a1);
        a1.addAll(0, a);
        System.out.println(a1);
        System.out.println("--------------------");// addAll
        System.out.println(a); 
        a.remove(0);
        System.out.println(a); 
        System.out.println("--------------------");// remove()
        a.set(0, "XYXYX");
        System.out.println(a); 
        System.out.println("--------------------");// set()
        System.out.println(a.indexOf("zanish"));// indexoF()
        System.out.println(a.lastIndexOf("zanish"));//lastIndexof()
    }
}
