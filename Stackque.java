import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


public class Stackque {
public static void main(String[] args) {

    Stack<String> Stack = new Stack<>();

    Stack.push("Alice");
    Stack.push("Bob");
    Stack.push("Charlie");

    System.out.println("Top : " + Stack.peek());

    System.out.println("popped :" + Stack.pop() );

    for (String name : Stack ){
        System.out.println(name);

    }

    System.out.println("size : " + Stack.size());



   Queue<String> queue = new LinkedList<>();

//    queue.add("Alice");
//    queue.add("Bob");
//    queue.add("Charlie");

//    System.out.println("peeked : " + queue.peek());

//    System.out.println("pooled :" + queue.poll());

//    for (String name2 : queue ){
//     System.out.println(name2);
//    }

//    System.out.println("size : " + queue.size());

queue.add("john");
queue.add("Sara");
queue.add("mike");
queue.add("Emma");


System.out.println("peeked :" + queue.peek());

System.out.println("poll : " + queue.poll());
System.out.println("poll : " + queue.poll());


queue.add("David");

for (String name3 : queue){
    System.out.println(name3);
}





}
}

