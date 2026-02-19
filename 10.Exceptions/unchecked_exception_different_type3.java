public class unchecked_exception_different_type3 {
     public static void main(String[] args) {
        try {
           String s="anish";
            System.out.println(s.charAt(5));
        } catch (NumberFormatException e) {
            System.out.println("this is NumberFormatException");
        } catch (NullPointerException e){
            System.out.println("this is NullPointerException");
        }catch (ArithmeticException e){
            System.out.println("this is ArithmeticException");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("this is StringIndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("this is Exception");
        }    
    }
}
