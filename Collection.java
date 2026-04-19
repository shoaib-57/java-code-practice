   import java.util.ArrayList;
                           
   public class Collection {
      public static void main(String[] args) {
      ArrayList<String> students   = new ArrayList<>();
   students.add("bob") ;
   students.add("Alice");
   students.add("Charlie");
   students.add("David ");

   for ( int  i=0; i<students.size(); i++){
      System.out.println(students.get(i));

   }
   students.remove("bob");
   System.out.println("----after removing bob --------");

   for ( int  i=0; i<students.size(); i++){
      System.out.println(students.get(i));
   }
   System.out.println("total students:" + students.size());
   }
   }
