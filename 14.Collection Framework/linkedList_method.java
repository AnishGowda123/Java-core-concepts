import java.util.LinkedList;
import java.util.Vector;

public class linkedList_method {
    public static void main(String[] args) {
        LinkedList li= new LinkedList();
         li.add("java");
         li.add("python");
         li.add("mysql");

         System.out.println(li);
        System.out.println("*------------------------------------*");
        LinkedList v1 = new LinkedList(li);
        System.out.println(v1);
        v1.remove(2);
        System.out.println(v1);
    }
}
