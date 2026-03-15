import java.util.ArrayList;
import java.util.ListIterator;

public class list_iterator_cursor {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("java");
        s.add("python");
        s.add("sql");
        s.add("web");
        s.add("css");

          ListIterator<String> ltr=s.listIterator();

          while (ltr.hasNext()) {
             String s1 = ltr.next();
             System.out.println(s1);

             if (s1.equals("java")) {
                ltr.remove();
             }
             if (s1.equals("sql")) {
                ltr.set("mysql");
             }
             if (s1.equals("css")) {
                ltr.add("+html");
             }
            
          }
          System.out.println(s);
    }
}
