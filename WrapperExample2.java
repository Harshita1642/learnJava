//Wrapper to Primitive
public class WrapperExample2 {
    public static void main(String[] args) {
        //Converting Integer into int
        Integer a=new Integer(4);
        // a.notify();
        System.out.println(a.getClass());
        int i=a.intValue();//converting Integer into int
        int j=a;//Unboxing,now compiler will write a.intValue() internally
        System.out.println(a+" "+i+" "+j);  
    }
}