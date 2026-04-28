import java.util.LinkedHashSet;


public class sett {

    public static void main(String[] args) {
        
    
  LinkedHashSet<String> set = new LinkedHashSet<>();

  set.add("Mango");
  set.add("apple");
  set.add("Mango");
  set.add("apple");
  set.add("Banana");


  for(String name : set ){
   System.out.println(name);
  }

 

  System.out.println("size :" + set.size());

if (set.contains("apple") ){
    System.out.println("Apple found! ");


set.remove("Banana");

for (String name2 : set ){
    System.out.println("Remaining : " + name2);
}




}

LinkedHashSet<String> history = new LinkedHashSet<>();


history.add("google.com");
history.add("youtube.com");
history.add("google.com");
history.add("facebook.com");
history.add("youtube.com");

for(String name3 : history ){
    System.out.println(name3);
}
    }qw
}
