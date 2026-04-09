public class Shape {
   
void  area(){
System.out.println("calculating area ....." );
    }
}
    class Circle extends Shape{
    double radius;
    void  area(){
    System.out.println("area of circle: " + (3.14 * radius * radius) );
        

    }
    }
    class Rectangle extends Shape{
        double length , width;
        void area(){
        System.out.println("area of rectangle : " + (length * width ));
        }
    }
    class Triangle extends Shape{
        double base , height ;

    void area(){
    System.out.println("area of triangle : " + (0.5 * base * height ));
        }

        public static void main(String[] args) {
            Circle c = new Circle();
            c.radius = 6;

            Rectangle r = new Rectangle();
            r.length = 5;
            r.width = 3;

            Triangle t = new Triangle();
            t.height = 6;
            t.base = 4;

          c.area();
          r.area();
          t.area();
fvf
        }
    }
   
    
    

