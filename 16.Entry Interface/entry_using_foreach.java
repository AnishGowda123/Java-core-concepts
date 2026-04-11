import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class entry_using_foreach{
    public static void main(String[] args) {
         Map<String,Integer> m=new LinkedHashMap<String,Integer>();
         m.put("java", 10);
         m.put("python", 25);
         m.put("html", 65);
         System.out.println(m);
         System.out.println("-------------------");

          Set<Entry<String,Integer>> x=m.entrySet();

          for (Entry<String,Integer> lv : x) {

            System.out.println(lv.getKey()+","+lv.getValue());
            
          }
    }
}