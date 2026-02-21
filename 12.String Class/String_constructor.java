public class String_constructor {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("python");
        String s3 = new String("java");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
