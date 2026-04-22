import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

    set.add("apple");
    set.add("banana" );
    set.add("mango");
    set.add("apple");
    set.add("banana");

    for(String fruit : set ){
    System.out.println( fruit );
    }
    
    
System.out.println("total fruits:" + set.size());

if (set.contains("mango")){
    System.out.println("mango found ");
}
set.remove("banana");



System.out.println("remaining fruit : ");
for(String fruit : set ){
    System.out.println(  fruit );
}


        String[] names = {"Alice", "Bob", "Alice", "Charlie", "Bob", "David"};

        HashSet<String> uniquename = new HashSet<>();

       

        for (String name: names ){
            uniquename.add(name);
        }

        for(String name : uniquename )
        System.out.println(name);


    }




    }


