//Primitive to Wrapper
public class WrapperExample1 {
    public static void main(String[] args) {
        //Converting int into integer
        int a=20;
        Integer i=Integer.valueOf(a);//Converting int into integer
        Integer j=a;//autoboxing,now compiler will write Integer.valueOf(a) internally
        System.out.println(a+" "+i+" "+j);
    }
}