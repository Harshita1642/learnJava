final class FinalUse
{

}
class A //extends FinalUse (class with final word can never be inherited)
{
    final int val=12;
    final void display()
    {
        System.out.println("I am part of class A");
    }
    // void changevalue()
    // {
    //     val=14;// any final type variable cannot change the value of final variable 
    // }
}
class B extends A
{
    // void display()
    // {
    //     System.out.println("i am part of class B");
    // }
    // we can't override if we make any method as final
}
public class FinalKeyword {
    public static void main(String[] args) {
        B ob=new B();
        ob.display();// it will process display function of class A
    }
}
