class JavaExample
{
    static int num;
    static String mystr;
    //first static block
    static{
        System.out.println("Static block1");
        num=97;
        mystr="block1";
    }
    //second static block
    static{
        System.out.println("Static block2");
        num=98;
        mystr="block2";
    }
}
public class multipleStaticBlocks {
    public static void main(String[] args) {
        //clashing not take place here as both static works without calling before main so in block2 num and mystr's value get updated
        System.out.println("value of num: "+JavaExample.num);
        System.out.println("value of mystr: "+JavaExample.mystr);
    }
}
