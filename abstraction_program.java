public  abstract class abstraction_program {
    public abstract double balance();
    public abstract void withdraw(int amount);
    public abstract void deposit(int amount); 
}
//------------------------------
class data extends abstraction_program{
    double balance=20000;
    public  double balance(){
        return this.balance;
    }
    public  void withdraw(int amount){
        this.balance-=amount;
    }
    public  void deposit(int amount){
        this.balance+=amount;
     }
     public static void main(String[] args) {
        data ob = new data();
        System.out.println(ob.balance);
        ob.withdraw(5000);
        ob.deposit(25000);
        System.out.println(ob.balance);
     }
}


