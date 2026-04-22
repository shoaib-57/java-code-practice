import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

    set.add("apple");
    set.add("banana" );
    set.add("mango");
    set.add("apple");
    set.add("banana");

    // for(String fruit : set ){
    // System.out.println( "total fruit : "+ fruit );
    // }
    
// System.out.println("total size :" + set.size());

if (set.contains("mango")){
    System.out.println("mango found ");
}
set.remove("banana");

for(String fruit : set ){
    System.out.println("remaining fruit : " + fruit );
}
    }
}
