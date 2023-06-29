class A
{
    protected
    void fnc1(){
        System.out.println("I am in first class ");
    }
}
class B extends A
{
    void fnc2(){
        System.out.println("I am in second class ");
    }
}

public class inheritanceBegins {
    public static void main(String[] args) {
        // A a= new A();
        // a.fnc1();
        B b= new B();
        b.fnc1();
        b.fnc2();
    }
}
