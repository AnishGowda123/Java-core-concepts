public class clone_method2 implements Cloneable{
     String name;
    int mark;
    int uid;

    public clone_method2(String name,int mark,int uid){
        this.name=name;
        this.mark=mark;
        this.uid=uid;
    }
     public String toString() {
        return this.name+","+this.mark+","+this.uid;
    }
    public static void main(String[] args) {
        clone_method2 cs = new clone_method2("anish", 100, 69);

        clone_method2 [] c= new clone_method2[5];
        for (int i = 0; i < c.length; i++) {
            try {
                c[i]=(clone_method2)cs.clone();
            } catch (CloneNotSupportedException e) {
            }
        
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
