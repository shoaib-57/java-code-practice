// public class Arithmetic {
//     public static void main(String[] args) {
        
//     try {
//         int result  = 10/0;
//     } catch (ArithmeticException e ) {
//         System.out.println("cannot divide by zero");

//     }finally {
//         System.out.println("this block will always execute ");
//     }
//     }
// }


// public class Arithmetic {
// public static void main(String[] args) {
//     int array[] = {1, 2, 3, 4, 5};
//     try {
//         int result = array[10];
//         int division = 10/0;
//     }catch (ArrayIndexOutOfBoundsException e) {
//         System.out.println(("Error: Index does not exist!"));

//     }catch (ArithmeticException e ) {
//         System.out.println(("Error cannot divide by zero"));

//     }
//     finally {
//         System.out.println("finally prints done ");
//     }



//     }
// }

// public class Arithmetic {
//     public static void main(String[] args) {
//         try {
//             int num = Integer.parseInt("abc");
//             // int num = Integer.parseInt("123");
//         } catch (NumberFormatException e){
//             System.out.println("Invalid number format");
//         }finally {
//             System.out.println("connversion attempted!");
//         }


//         }
//     }

public class Arithmetic {
    
  static void checkage(int age ) throws ArithmeticException {
    if (age < 0) {
        throw new ArithmeticException ("Age cannot be negative");
    }else {
        System.out.println("Valid age: " + age);
    }

}
public static void main(String[] args) {
    try {
        checkage(-10);

    }catch (ArithmeticException e ) {
        System.out.println("Error: " + e.getMessage());
    }
}
    }

       

        





 
