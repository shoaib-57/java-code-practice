//Inheritance 

public class Animal {
    String name;

    Animal (String name ){
        this.name = name;

    }

    void eat(){
        System.out.println(name + "is eating ");
    }

}

class Dog extends Animal {
    Dog (String name ){
        super (name );
    }
    void bark(){
        System.out.println(name + "is barking ");
      
    }
}
    class Cat extends Animal {
        Cat (String name ){
            super (name);
        }
    void meow(){
        System.out.println(name + "is meowing");
    }
    
}
class Bird extends Animal {
    Bird (String name ){
        super (name);
    }
    void fly(){
        System.out.println(name + "is flying ");
    }




    public static void main(String[] args) {
    Dog d = new Dog(" bruno ");
     

    d.eat();
    d.bark();

    Cat c = new Cat(" billo ");
  
    c.eat();
    c.meow();

    Bird b  = new Bird(" tweety ");
  
    b.eat();
    b.fly();

}
}







