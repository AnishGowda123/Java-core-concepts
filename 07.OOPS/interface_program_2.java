public interface interface_program_2 {
      double balance();
      void withdraw(int amount);
      void deposit(int amount); 
}
//------------------------------
class data implements interface_program_2 {
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
