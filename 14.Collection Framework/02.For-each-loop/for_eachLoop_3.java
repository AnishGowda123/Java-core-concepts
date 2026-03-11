import java.util.ArrayList;

public class for_eachLoop_3 {  
     public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("java");
        a.add("python");
        a.add("c++");
        a.add("hibernate");
        a.add("spring");
        a.add("sql");
        System.out.println(a);
        System.out.println("-++++++++++++++++++++++++++++++++");
        for (String lv : a) {
            System.out.println(lv);
        }
    } 
}