class Circle
{
    static double PI=3.14;

    // this and super cannnot be used in static context
    // Circle(int radius){
    //     this.radius=radius;
    // }

    static void getPI(){
        System.out.println(PI);
        //static method can not use non static data member or call non-static method method directly
        //static methods are class bounded so it does not allow object bounded variables.
        //static method belongs to the class rather then object of a class.
    }
}
public class staticmethod {
    public static void main(String[] args) {
        //static method can be invoked without the need for creating an instance of a class
        Circle.getPI();
        
    }
}