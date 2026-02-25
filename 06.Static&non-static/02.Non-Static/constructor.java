public class constructor {
    int id;
    int mark;
    String name;
    float per;

    public constructor(int id,int mark,String name,float per){
        this.id=id;
        this.mark=mark;
        this.name=name;
        this.per=per;
    }
    public static void main(String[] args) {
        constructor ob = new constructor(10,500,"anish",95);
        constructor ob1 = new constructor(20,450,"manish",85);
        System.out.println(ob.id+","+ob.mark+","+ob.name+","+ob.per);
        System.out.println("----------------------------------");
        System.out.println(ob1.id+","+ob1.mark+","+ob1.name+","+ob1.per);

    }
}
