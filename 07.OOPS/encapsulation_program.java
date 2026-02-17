
public class encapsulation {
    private double amount = 10000d;

    public double balance(){
    return this.amount;
    }

    public void deposit(int add){
        this.amount+=add;
    }
    public void withdraw(int add){
        this.amount-=add;
    }

}

class data extends encapsulation {
    public static void main(String[] args) {
        data ob= new data();
        System.out.println(ob.balance());
        ob.deposit(5000);
        System.out.println(ob.balance());
        ob.withdraw(2500);
        System.out.println(ob.balance());

    }
}

