class Circle
{
    int radius;
    static double PI=3.14;
    //Constructor
    // Circle(){
    //     radius=7;
    //     PI=3.14;
    // }

    //Parameterised Constructor
    Circle(int radius){
        this.radius=radius;
    }
    void displayarea(){
        double area=PI*radius*radius;
        System.out.println("Area of the circle: "+area);
    }
    void displayperimeter(){
        double perimeter=2*PI*radius;
        System.out.println("Perimeter of the circle: "+perimeter);
    }
}
class Rectangle
{ 
    double length,breadth;
    // Rectangle(){
    //     length=1.2;
    //     breadth=2.4;
    // }
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void displayarea(){
        double area=length*breadth;
        System.out.println("Area of the rectangle: "+area);
    }
    void displayperimeter(){
        double perimeter=2*(length+breadth);
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }
}
public class classsesInJava{
    public static void main(String[] args) {
        // Circle c=new Circle();
        // c.displayarea();
        // c.displayperimeter();

        //parameterised
        Circle c=new Circle(7);
        c.displayarea();
        c.displayperimeter();

        Circle c1=new Circle(9);
        c1.displayarea();
        c1.displayperimeter();


        // Rectangle r=new Rectangle();
        // r.displayarea();
        // r.displayperimeter();
        // System.out.println(Circle.PI);

        //parameterised 
        Rectangle r = new Rectangle(2, 3);
        r.displayarea();
        r.displayperimeter();
    }
}