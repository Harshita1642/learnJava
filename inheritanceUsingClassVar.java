class First
{
    String i;
    First(String i){
        this.i=i;
    }
    
}
class Second extends First
{
    String i;
    Second(String i,String i1){
        super(i);
        this.i=i1;
    }
    void func1(){
        System.out.println("I am part of first class and "+ super.i+" of class second");
    }
    void func2(){
        System.out.println("I am part of second class and "+ i+" of class first");
    }
    
}
public class inheritanceUsingClassVar {
    public static void main(String[] args) {
        Second s=new Second("parent", "child");
        s.func1();
        s.func2();
    }
}
