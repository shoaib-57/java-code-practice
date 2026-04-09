//encapsulation

public class encapsulation {
    private String name ;
    private int age ;

    encapsulation(String name , int age ){
        this.name = name ;
        this.age = age ;

    }

    public void bark(){
        System.out.println("my name is " + name);
    }
    public void info(){
        System.out.println(name + "is " + age + "years old ");
    }

    public String getName(){
     return name ;

    }
    public int getAge(){
     return age ;
     
    }
    
    public void setName(String name ){
        if(name.isEmpty()){
            System.out.println("invalid name ");
          }else{
            this.name = name ;
           
          }
    }
    public void setAge(int age ){
        if (age < 0 ){
     System.out.println("invalid age ");
        }else {
            this.age = age ;

        }

    }
    public static void main(String[] args) {
        encapsulation d1 = new encapsulation("bruno", 3);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());

        d1.setName("");
        d1.setAge(-5);



        encapsulation d2 = new encapsulation("tommy ", 5);
        System.out.println(d1.getName());
        System.out.println(d2.getAge());

        d2.setAge(55);
        d2.setName("eikyanbe");
        // d1.bark();
        // d1.info();
        // d2.bark();
        // d2.info();

    }
}


