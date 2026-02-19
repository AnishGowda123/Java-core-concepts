public class unchecked_exception_different_type {
    public static void main(String[] args) {
        try {
            String s1=null;
            System.out.println(s1.length());
        } catch (NumberFormatException e) {
            System.out.println("this is NumberFormatException");
        } catch (NullPointerException e){
            System.out.println("this is NullPointerException");
        }catch (ArithmeticException e){
            System.out.println("this is ArithmeticException");
        }catch (Exception e){
            System.out.println("this is Exception");
        }    
    }
}
