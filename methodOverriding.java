class One
{
    void func(){
        System.out.println("I am part of class one");
    }
}
class Two extends One
{
    void func(){
        System.out.println("I am part of class two");
    }
}
public class methodOverriding{
    public static void main(String[] args) {
        One test;//reference
        test=new Two();//object creation
        test.func();
    }
}