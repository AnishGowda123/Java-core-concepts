public class finally_block2 {
    public static void main(String[] args) {
        try {
            int[]a={10,20,30,40,50,60};
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("<<<ArrayIndexOutOfBoundsException>>");
        }
        finally{
            System.out.println("end of array>>>");
            }
        }
    }