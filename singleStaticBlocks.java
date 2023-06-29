class JavaExample
{
    static int num;
    static String mystr;
    static{
        num=97;
        mystr="Static keyword in Java";
    }

    //main method sirf uska chlta hai jo file name ki class mein present ho
    // public static void main(String args[]){
    //     System.out.println("Value of num: "+num);
    //     System.out.println("value of mystr: "+mystr);
    // }
}
public class singleStaticBlocks {
    public static void main(String[] args) {
        System.out.println("Value of num: "+JavaExample.num);
        System.out.println("value of mystr: "+JavaExample.mystr);
    }
    // main is not always a entry gate but static blocks are pre-entry gates
}
