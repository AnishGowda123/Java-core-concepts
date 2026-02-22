/*-------------------------parent class------------------------- */
class parent_class{
    int x=30;
    static int c=20;
    int y=60;
    public static void test1(){
            System.out.println("test 1");
        }
}
/*--------------------------child class------------------------*/
public class inheritance extends parent_class{
    int y=20;
     public void display(){
        int x=10;
        System.out.println(x);
        System.out.println(y);
        
    }
    public static void test(){
            System.out.println("test");
        }
    public static void main(String[] args) {
        inheritance ob=new inheritance();
        ob.display();
        System.out.println("--------------------------");
        System.out.println(ob.x);
        System.out.println(ob.c);
        System.out.println(ob.y);
        ob.test();

    }
}