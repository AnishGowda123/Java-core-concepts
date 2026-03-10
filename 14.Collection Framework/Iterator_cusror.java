import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_cusror {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("java");
        a.add("python");
        a.add("mangoDB");

          Iterator<String>l =a.iterator();
          while (l.hasNext()) {
            String s = l.next();
            System.out.println(s);
            System.out.println("*-----------------------------------*");
                if (s.equals("java")) {
                    l.remove();
                }
          }
           System.out.println(a);
    }
}
