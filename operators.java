public class operators {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        int c=a+b;
        char operation='/';
        if(operation=='+'){
            System.out.println(a+"+"+b+"="+c);
        }else if(operation=='-'){
            System.out.println(a+"-"+b+"="+(a-b));
        }else if(operation=='*'){
            System.out.println(a+"*"+b+"="+a*b);
        }else if(operation=='/'){
            System.out.println(a+"/"+b+"="+a/b);
        }else if(operation=='%'){
            System.out.println(a+"%"+b+"="+a%b);
        }     

        int age=12;
        char gender='g';
        if(age<18){
            if(gender=='b'){
                System.out.println("can vote");
            }else{
                System.out.println("can't vote");
            }
        }else{
            System.out.println("eligible for vote");
        }
    }
}
