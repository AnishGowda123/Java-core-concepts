/*-------------------parent class------------------------ */
public class polymorphism {
    String name;
    int mark;
    public polymorphism(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
    public void marks(){
        System.out.println("report details");
    }
}
/*----------*child-1*--------- */
 class Student1 extends polymorphism{
    float per;
    public Student1(String name,int mark,float per){
        super(name, mark);
        this.per=per;
    }
public void marks(){
       System.out.println("Student name: "+this.name +" ,"+"mark= "+this.mark+" ,"+"percentage= "+this.per);
    }
 }
/*----------*child-2*--------- */
 class Student2 extends polymorphism{
    float per;
    public Student2(String name,int mark,float per){
        super(name, mark);
        this.per=per;
    }
public void marks(){
       System.out.println("Student name: "+this.name +" ,"+"mark= "+this.mark+" ,"+"percentage= "+this.per);
    }
 }
/*----------*child-3*--------- */
 class Student3 extends polymorphism{
    float per;
    public Student3(String name,int mark,float per){
        super(name, mark);
        this.per=per;
    }
public void marks(){
       System.out.println("Student name: "+this.name +" ,"+"mark= "+this.mark+" ,"+"percentage= "+this.per);
    }
 }
/*----------DATA DRIVER--------- */
 class details{
    public static void main(String[] args) {
        polymorphism ob = new Student1("anish", 85, 90.5f);
        polymorphism ob1 = new Student2("manish",77, 80.5f);
        polymorphism ob2= new Student3("tanish", 95, 95.5f);

        polymorphism [] x={ob,ob1,ob2};
        for (int i = 0; i < x.length; i++) {
        x[i].marks();   
        }
    }
 }