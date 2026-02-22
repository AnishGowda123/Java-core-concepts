public class StringBuffer_method1 {
    public static void main(String[] args) {
        StringBuffer s1 =new StringBuffer("java");
        StringBuffer s2 =new StringBuffer("python");

        System.out.println(s1);
        s1.append(5);
        s1.append(false);
        System.out.println(s1);
        System.out.println("+----------+");
        System.out.println(s2);
        s2.append(5);
        s2.append(true);
        System.out.println(s2);

        
    }
}
