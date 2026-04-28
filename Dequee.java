import java.util.ArrayDeque;
public class Dequee {

    public static void main(String[] args) {
        
    

    ArrayDeque<String> deque = new ArrayDeque<>();

    deque.addLast("Alice");
    deque.addLast("Bob");
    deque.addLast("Charlie");
    deque.addFirst("David");


    System.out.println(deque);


    System.out.println(deque.peekFirst());
    System.out.println(deque.peekLast());

    System.out.println("removed from the front : " + deque.removeFirst());
    System.out.println("removed from last : " + deque.removeLast());

    System.out.println(deque);

        
    ArrayDeque<String> page  = new ArrayDeque<>();
    page.addLast("page 1 ");
    page.addLast("page 2 ");
    page.addLast("page 3 ");


   System.out.println("current page : " + page.peekFirst());
   
   System.out.println("pop first :" + page.pop());
   System.out.println("pop 2nd : "+ page.pop());

   System.out.println("current page : " + page);



    
}
}
