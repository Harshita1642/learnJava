class A //parent class
{
    void display()
    {
        System.out.println("I am part of class A");
    }
}
class B extends A//subclass A which is inherating superclass A  
{
    //extend keyword indicates that you are making a new class that drives from an existing class.
    //maening of "extends" is to increase the functionaLity
    void display()
    {
        System.out.println("I am part of class B");
    }
}
//if child class has the same method as declared in parent class ,it is called method overriding
public class methodsOverriding {
    public static void main(String[] args) {
        B ob=new B();
        ob.display();
        //method overriding is used for runtime polymorphism
    }
}