import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<Integer>();
        s.add(100);
        s.add(700);
        s.add(500);
        s.add(200);
        s.add(300);
        s.add(400);
        System.out.println(s);
        System.out.println("------------------------------");
        Integer s1 = s.first();// first()
        System.out.println(s1);
        System.out.println("------------------------------");
        Integer s2 = s.last();// last()
        System.out.println(s2);
        System.out.println("------------------------------");
        Set s3 = s.headSet(200);// headset()
        System.out.println(s3);
        System.out.println("------------------------------");
        Set s4 = s.tailSet(400);// tailset()
        System.out.println(s4);
        System.out.println("------------------------------");
        Set s5 = s.subSet(200,500);// subset()
        System.out.println(s5);
        System.out.println("------------------------------");





        

        


    }
}
