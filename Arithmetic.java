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

// public class Arithmetic {
    
//   static void checkage(int age ) throws ArithmeticException {
//     if (age < 0) {
//         throw new ArithmeticException ("Age cannot be negative");
//     }else {
//         System.out.println("Valid age: " + age);
//     }

// }
// public static void main(String[] args) {
//     try {
//         checkage(-10);

//     }catch (ArithmeticException e ) {
//         System.out.println("Error: " + e.getMessage());
//     }
// }
//     }


// public class Arithmetic {
//     static void withdraw(double balance , double amount) throws ArithmeticException{
//         if (amount > balance) {
//             throw new ArithmeticException ("Insufficient balance!");
//         }else {
//             System.out.println("withdrawal successful! remaining balance: " + (balance - amount));
//         }
//     }
//     public static void main(String[] args) {
//         try {
//                 withdraw (1000, 500);
//         }catch (ArithmeticException e)
//         {
//             System.out.println("Error: " + e.getMessage());
//         }
        
//     }
// }
       
// public class Arithmetic {
//     static void ValidatePassword(String password) throws Exception {
//         if (password.length() < 8) {
//             throw new Exception ("password too short!");

//         }else if (password.equals("12345678")){
//            throw new Exception ("password is too weak");

//         }else {
//             System.out.println("password is strong");
     
// } 
        
//       }
      
//       public static void main(String[] args) {
       
//         String[] passwords = {"abc ", "12345678", "Mypassword123 "};
//         for (String p : passwords ){
//             try {
//                 ValidatePassword(p);

//             }catch(Exception e ) {
//             System.out.println("Error:  " + e.getMessage());
//             }
//         }
            
        
//       }
//     }
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Arithmetic {
    static void withdraw (double balance , double amount ) throws InsufficientBalanceException  {
     if (amount > balance ){
        throw new InsufficientBalanceException ("Insufficient balance ");

     }else {
        System.out.println("succesful " + (balance - amount));
     }

    }
    public static void main(String[] args) {
        try {
            withdraw(1000,1500);
           
        }catch (Exception e ){
            System.out.println("invalid :" + e.getMessage());
        }

        try {
           
            withdraw(1000,500);
        }catch (Exception e ){
            System.out.println("invalid :" + e.getMessage());
        }qwer
}
}



        





 
