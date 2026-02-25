public class this_keyword {
    int apple;
    int banana;
    int grape;
     public this_keyword(int apple,int banana,int grape){
        this.apple=apple;
        this.banana=banana;
        this.grape=grape;
     }
     public static void main(String[] args) {
        this_keyword ob = new this_keyword(20, 50, 60);
        System.out.println("the total amount of apple,banana,grape= "+ob.apple+","+ob.banana+","+ob.grape);
     }
}