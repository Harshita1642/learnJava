class A
{
    void func(){
        System.out.println("I am parent class");
    }
}
class B extends A
{
    void func(){
        System.out.println("I am eldest child");
    }
}
class C extends A
{
    void func(){
        System.out.println("I am elder child");
    }
}
class D extends A
{
    void func(){
        System.out.println("I am youngest child");
    }
}
public class hirarchialInheritance {
    public static void main(String[] args) {
        A e;
        e=new B();
        e.func();

        e=new C();
        e.func();

        e=new D();
        e.func();
    }
}
