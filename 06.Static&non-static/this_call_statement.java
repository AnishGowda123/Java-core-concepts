public class this_call_statement {
    int a=10;
    public this_call_statement(int a){
        this(20,50);
        System.out.println("constructor-1");
    }
    public this_call_statement(int a,int b){
        this(10,20,30);
        System.out.println("constructor-2");
    }
    public this_call_statement(int a,int b,int c){
        System.out.println("constructor-3");
    }
    public static void main(String[] args) {
        this_call_statement ob = new this_call_statement(10);
    }
}
