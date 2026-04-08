public class Dog {
    private String name ;
    private int age ;

    Dog(String name , int age ){
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
        Dog d1 = new Dog("bruno", 3);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());

        d1.setName("");
        d1.setAge(-5);







        Dog d2 = new Dog("tommy ", 5);
        System.out.println(d1.getName());
        System.out.println(d2.getAge());

        d2.setAge(55);
        d2.setName("eikyanbe");
        // d1.bark();
        // d1.info();
        // d2.bark();
        // d2.info();

    }


jhjsh
}
