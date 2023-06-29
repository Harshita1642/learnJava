//a class that have no name is called Anonymous inner class.It should be used to override method or interface
abstract class Person
{
    abstract void eat();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Person p=new Person() {
            void eat()
            {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
