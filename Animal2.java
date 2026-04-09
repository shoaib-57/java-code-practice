public class Animal2 {

    String name ;

    void speak(){
        System.out.println(name + "make a sound");

    }

}
class Dog extends Animal2{
    void speak(){
        System.out.println(name + "says woof");
    }
}
class Cat extends Animal2{
    void speak (){
     System.out.println(name + "says meow");   
    }
}
class Bird extends Animal2{
    void speak (){
        System.out.println(name + "says chrip");
    }
  public static void main (String[] args) {

  Dog d = new Dog();
  d.name = " dog" ;

  Cat c = new Cat();
  c.name = "cat";

  Bird b = new Bird();
  b.name = " parrot";

  c.speak();
  d.speak();
  b.speak();

}
}




