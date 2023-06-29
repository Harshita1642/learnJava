class One
{
    static double PI=3.14;
    One(int length,int breadth)//rect
    {
        System.out.println("Area of rectangle: "+length*breadth);
    }
    One(double radius)//circle
    {
        System.out.println("Area of circle: "+PI*radius*radius);
    }
    One(int length,int breadth,int height)//cuboid
    {
        System.out.println("Volume of Cuboid: "+length*breadth*height);
    }
    One(int side)//square
    {
        System.out.println("Area of square: "+side*side);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        new One(3);
        new One(2,3,4);
        new One(7.0);
        new One(1,5);
    }
}
