
// class Dog {
//     String name;
//     int age;

//     void bark() {
//         System.out.println("Woof! My name is " + name);
//     }

//     void info() {
//         System.out.println(name + " is " + age + " years old");
//     }

//     public static void main(String[] args) {
//         Dog d1 = new Dog();
//         Dog d2 = new Dog();

//         d1.name = "Bruno";
//         d1.age = 3;
//         d2.name = "tommy";
//         d2.age = 5;
//         d1.bark();
//         d1.info();
//         d2.bark();
//         d2.info();
//     }
// }
class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name ;  // 'this' means this object's name
        this.age = age;
        

    }
    

    void bark() {
        System.out.println("Woof! My name is " + name);
    }

    void info() {
        System.out.println(name + " is " + age + " years old");
    }




 public static void main(String[] args) {
     Dog d1 = new Dog ("bruno ", 3);
     Dog d2 = new Dog ("tommy ", 5);
   
     d1.bark();
     d1.info();
     d2.bark();
     d2.info();
     



}
    
}