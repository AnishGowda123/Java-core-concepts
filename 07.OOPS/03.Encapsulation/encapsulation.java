public class encapsulation {
    	 private double amount = 10000d;

	    public double getter(){
	    return this.amount;
	    }

	    public void setter(int add){
	        this.amount+=add;
	    }
}
//---------------------------------------------
 class data extends encapsulation{
	public static void main(String[] args) {
        encapsulation ob= new encapsulation();
        System.out.println(ob.getter());
        ob.setter(5000);
        System.out.println(ob.getter());
    }
}
