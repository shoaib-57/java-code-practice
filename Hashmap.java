import java.util.HashMap;

// public class Hashmap {
//     public static void main(String[] args) {
//         HashMap<String , Integer > map = new HashMap <String , Integer>();

        // map.put("Alice ", 99);
        // map.get("Alice");
        // map.remove("Alice");
        // map.containsKey("Alice");
        // map.size();

        // System.out.println();


//         map.put("Alice",90);
//         map.put("Bob", 75);
//         map.put("Charlie",85);

//         for (String name : map.keySet()){
//         System.out.println(name + " : " + map.get(name ));
//         }
//         //for total students 
//         map.put("Bob", 95);
//         System.out.println(" Bobs updated marks : " + map.get("Bob") );

//        //total students
//        System.out.println("total number of students : " + map.size());
       


//     }
// }
// public class Hashmap{
//     public static void main(String[] args) {
//          HashMap<String , Integer > map = new HashMap <String , Integer>();

//          map.put("Alice",90);
//          map.put("Bob", 75);
//          map.put("Charlie",85);

        
//         if (map.containsKey("Alice")){
//             System.out.println("Alice found ");
//         }
//         map.remove("Charlie");

//         System.out.println("Remaining students ");

//          for (String name : map.keySet()){
// //         
        
//         System.out.println(name + " : " + map.get(name ));
//     }
// }
// }
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap <String , Integer>();

        String[] words = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        
        for(String word : words  )
        if (map.containsKey(word)){
            map.put(word , map.get(word) + 1);
        
        }else {
            map.put(word , 1);

        }
       for (String name : map.keySet()){
        System.out.println(name + " : " + map.get(name));12
       }
    }
}