class Calculate
{
    
    static double PI=3.14;
    void area(double radius){
        System.out.println("Area of circle: "+PI*radius*radius);
    }
    void area(double length,double breadth){
        System.out.println("Area of rectangle: "+length*breadth);
    }
    void area(float radius){
        System.out.println("Area of sphere: "+4*PI*radius*radius);
    }
}
public class taskforOverloading {
    public static void main(String[] args) {
        Calculate test=new Calculate();
        test.area(7.0);
        test.area(2,3);
        test.area(7f);
    }
}
