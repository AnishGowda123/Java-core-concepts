/*-----------------------parent class------------------------------ */
class bank{
    static String bank = "ICICI";
    int id = 101;

    public static void about(){
        System.out.println(bank+" this is a trusted bank");
    }
}
/*----------------------child class-------------------------------- */
public class inheritance_program extends bank {
    String ename;
    public inheritance_program(String ename){
        this.ename= ename;
    }
    public  void details(){
        System.out.println(this.ename+" has account in and "+bank+" his eid is "+id);
    }
    public static void main(String[] args) {
        inheritance_program ob1 = new inheritance_program("rohan");
        ob1.about();
        ob1.details();
        System.out.println("bank name: "+ob1.bank);
        System.out.println("user name: "+ob1.ename);
        System.out.println("id: "+ob1.id);
    } 
}