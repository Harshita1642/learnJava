class One
{
    void func(int a){
        System.out.println("I am 1st function");
    }
    void func(float p){
        System.out.println("I am 2nd function");
    }
    void func(){
        System.out.println("I am 3rd function");
    }
}
//if we have to perform only one operation,having same name of the methods increases the readability of program 
public class methodOverloading {
    //if a class has a mmultiple methods having same name but diff in parameters ,it is known as method overloading
    public static void main(String[] args) {
        One test=new One();
        test.func(2);
        test.func(1.4f);
        test.func();
        //2 ways to overload the method:- 1)By changing the number of arguments 2)By chanding the datatype
        //IMPORTANT : method overloading is not possible by changing return type of method only
    }
}
