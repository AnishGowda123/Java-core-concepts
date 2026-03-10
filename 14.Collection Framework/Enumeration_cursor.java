import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_cursor {
    public static void main(String[] args) {
        Vector<String> v= new Vector<String>();
        v.add("java");
        v.add("python");
        v.add("sql");
             Enumeration<String> e=v.elements();

             while (e.hasMoreElements()) { // hasMoreElement()
                String s = e.nextElement();//nextElement
                System.out.println("********************");
                System.err.println(s);
             }
    }
}