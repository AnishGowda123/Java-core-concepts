public class unchecked_exception_different_type2 {
     public static void main(String[] args) {
        try {
           int[] a={5,4,6,2,3};
           System.out.println(a[5]);
        } catch (NumberFormatException e) {
            System.out.println("this is NumberFormatException");
        } catch (NullPointerException e){
            System.out.println("this is NullPointerException");
        }catch (ArithmeticException e){
            System.out.println("this is ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("this is ArrayIndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("this is Exception");
        }    
    }
}

