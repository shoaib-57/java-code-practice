import java.util.TreeSet;

public class Treeee {
    public static void main(String[] args) {
        
        TreeSet<String> treee = new TreeSet<>();
 

        treee.add("Mango");
        treee.add("Apple");
        treee.add("Banana");
        treee.add("Cherry");
        treee.add("Banana");



        System.out.println(treee);


        System.out.println("first element: " + treee.first());
        System.out.println("last element : " + treee.last());


        System.out.println("size : " + treee.size());


        System.out.println("before cherry : " + treee.headSet("Cherry") );
        System.out.println("after Cherry : " + treee.tailSet("Cherry") );

        System.out.println("size : " + treee.size());




         TreeSet<Integer> num = new TreeSet<>();

    num.add(5);
    num.add(2);
    num.add(8);
    num.add(1);
    num.add(9);
    num.add(3);
    num.add(5);
    num.add(2);

    System.out.println(num);


    System.out.println("first  no :" + num.first());
    System.out.println("last no :" + num.last());

    





    }
   
    


   




}
