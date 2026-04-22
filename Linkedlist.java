import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.addLast("Alice");
        list.addLast("Bob");
        list.addLast("Charlie");
        list.addFirst("David");

        for(String name : list){
            System.out.println(name );
        }
        System.out.println("first name : " + list.getFirst());
        System.out.println("Last name : "+ list.getLast());


        list.removeFirst();
        list.removeLast();
        System.out.println("remaining list: " );
                for(String name : list){
            System.out.println(name );
        }
        
        

        

        System.out.println("size of list: " + list.size());

        list.add("Station A");
        list.add("Station B");
        list.add("Station C");
        list.add("Station D");

        for (String name : list){
            System.out.println(name );
        }

        list.addLast("Station E");
        list.remove("Station A");


        System.out.println("after update");
        for (String name : list){
         System.out.println(name);
        }


       


    }
}
