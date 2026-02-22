public class StringBuffer_method2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("java");


        StringBuffer s1=sb.insert(1, 2.5f);
                System.out.println(s1);


         StringBuffer s2=sb.insert(4, "zzzz");
                System.out.println(s2);
    }
}
