class Rectangle
{
    int length,breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}
class Circle extends Rectangle
{
    int radius;
    static double PI=3.14;
    Circle(int radius,int length,int breadth){
        super(length,breadth);//call base class constructor
        this.radius=radius;
        // this.length=length;
        // this.breadth=breadth;
    }   
    void letscheck(){
        System.out.println("length: "+length+" breadth: "+breadth+" radius: "+radius);
    }
}
class Calculate extends Circle
{
    Calculate(int radius,int length,int breadth){
        super(radius,length,breadth);
    }
    void area_rect(){
        System.out.println("Area of rectangle: "+length*breadth);
    }
    void area_circle(){
        System.out.println("Area of circle: "+PI*radius*radius);
    }
}
public class inheritanceTask {
    public static void main(String[] args) {
        // Circle c= new Circle(7, 2, 3);
        // c.letscheck();

        Calculate c1= new Calculate(7, 2, 3);
        c1.letscheck();
        c1.area_circle();
        c1.area_rect();
    }
}
