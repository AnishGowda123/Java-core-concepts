public class equals_method2 {
    int cc;
    int mil;

    public equals_method2(int cc,int mil){
        this.cc=cc;
        this.mil=mil;
    }
    public boolean equals(Object obj){
        equals_method2 temp = (equals_method2) obj;

        if(this.cc == temp.cc && this.mil== temp.mil){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        equals_method2 RE = new equals_method2(55, 40);
        equals_method2 yezdi = new equals_method2(65, 40);

        System.out.println(RE.equals(yezdi));
    }
}
