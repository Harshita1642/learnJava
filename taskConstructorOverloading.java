class Calculate
{
    Calculate(int a,int b){
        System.out.println("Sum of two integers: "+(a+b));
    }
    Calculate(float a,float b){
        System.out.println("Sum of float type paramters: "+(a+b));
    }
    Calculate(double a,double b){
        System.out.println("Sum of double type parameters: "+(a+b));
    }
}
public class taskConstructorOverloading {
    public static void main(String[] args) {
        new Calculate(4,6);
        new Calculate(9.88, 1.22);
        new Calculate(1.2f,3.8f);
    }
}
