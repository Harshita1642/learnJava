interface firstinterface
{
    //an interface can be defined as a container that stores the signatures of the methods to be implemented 
    //in the code segment...or we can say interface is the blueprint of the class
    void display();
}
interface secondInterface
{
    //interface only contains abstract methods
    void displayDetails();
}
class thirdOne
{
    void displaymyName()
    {
        System.out.println("I am class thirdOne");
    }
}
//Multiple and hybrid inheritance is supported through interface only
//Inheritance is known as IS-A relationship
public class MyInterface extends thirdOne implements firstinterface,secondInterface
 {
    public void display()
    {
        System.out.println("Welcome");
    }
    public void displayDetails()
    {
        System.out.println("I am declared in secondInterface");
    }
    public static void main(String[] args) {
     MyInterface ob=new MyInterface();
     ob.display();   
     ob.displayDetails();
     ob.displaymyName();
    }
}