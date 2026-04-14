public class Arithmetic {
    try {
        int result  = 10/0;
    } catch (ArithmeticException e ) {
        System.out.println("cannot divide by zero");

    }finally {
        System.out.println("this block will always execute ");
    }
}
qw
 
