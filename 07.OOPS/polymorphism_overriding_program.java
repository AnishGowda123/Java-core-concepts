/*parent class */
public class polymorphism_overriding_program {
    String bname;
    String cname;
    public polymorphism_overriding_program(String bname){
        this.bname=bname;
    }
    public float rateofintrest(){
        return 0.0f;
    }
    public void branch(){
        System.out.println("bank details");
    } 
}
/*----------------------child 1--------------------------*/
class ICICI extends polymorphism_overriding_program{
     public ICICI(String bname){
        super(bname);
    }
     public float rateofintrest(){
        return 5.5f;
    }
    public void branch(){
        System.out.println("ICICI is in "+this.bname);
    } 
}
/*-----------------------child 2-------------------------*/
class canara extends polymorphism_overriding_program{
     public canara(String bname){
        super(bname);
    }
     public float rateofintrest(){
        return 7.5f;
    }
    public void branch(){
        System.out.println("CANARA is in "+this.bname);
    }
}
/*-------------------------child 3-----------------------*/
class SBI extends polymorphism_overriding_program{
     public SBI(String bname){
        super(bname);
    }
     public float rateofintrest(){
        return 7.5f;
    }
    public void branch(){
        System.out.println("SBI is in "+this.bname);
    }
}
/*---------------DATA DETAILS----------------------- */
class data{
    public static void main(String[] args) {
        polymorphism_overriding_program ob1= new ICICI("KARNATAKA");
        polymorphism_overriding_program ob2= new canara("KERALA");
        polymorphism_overriding_program ob3= new SBI("TAMIL NADU ");

        polymorphism_overriding_program[] p ={ob1,ob2,ob3};
        for (int i = 0; i < p.length; i++) {
            p[i].branch();
            System.out.println("the rate of intrest is "+p[i].rateofintrest());
            System.out.println("--------------------");
        }
    }
}