import java.util.ArrayList;

public class generics_1{
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("java");
        a.add("python");
        a.add("c++");
        a.add("hibernate");
        a.add("spring");
        a.add("sql");
        System.out.println(a);
    }
}