abstract class MyAbstract
{
    abstract void method1();//it does not have its implementation in abstract class it is known as abstract method
    void method2()
    {
        System.out.println("i am non abstract method");
    }
}
class One extends MyAbstract
{
    //if you are extending any abstract class that have abstract method ,you must either provide the implementation
    //of the method or make this call abstract
    void method1()
    {
        System.out.println("I am abstract method of parent Myabstract class");
    }
}
public class Abstraction {
    //abstraction is a process of hiding the implementation details nad showing only functionality to the user
    //two ways to achieve abstraction in java 1)Abstract class 2)Interface
    public static void main(String[] args) {
        One ob=new One();
        ob.method1();
        ob.method2();
        //abstract class cannot be instantiated
    }
}
