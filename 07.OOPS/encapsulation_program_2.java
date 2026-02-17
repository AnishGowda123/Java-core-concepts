public class encapsulation_program_2 {
    private String name;
    private int usn;
    private int mark;
     
    public encapsulation_program_2(String name, int usn , int mark){
        this.name=name;
        this.usn=usn;
        this.mark=mark;
    }

    public String present_name(){
        return this.name;
    }
    public int present_usn(){
        return this.usn;
    }
    public int  present_mark(){
        return this.mark;
    }

    public void change_name(String cname){
        this.name=cname;
    }
    public void change_usn(int usn){
        this.usn=usn;
    }
    public void change_mark(int cmark){
        this.mark=cmark;
    }
}

class data{
    public static void main(String[] args) {
        encapsulation_program_2 ob = new encapsulation_program_2("harsha", 21,85);
        System.out.println(ob.present_name());
        System.out.println(ob.present_usn());
        System.out.println(ob.present_mark());
        ob.change_name("bharath");
        ob.change_usn(17);
        ob.change_mark(89);
        System.out.println("--------------------------------");
        System.out.println(ob.present_name());
        System.out.println(ob.present_usn());
        System.out.println(ob.present_mark());


    }
}
