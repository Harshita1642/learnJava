public class LocalInnerClass {
    private int data=30;
    void display()
    {
        //private int b=8; this gives error local variables can't be private,public,protected
        class Local
        {
           protected int a=90;
            void msg()
            {
                System.out.println("data is "+data+"a = "+a);
            }
        }
        Local l=new Local();//To invoke the methods of local inner class,you must instantiate this class inside the method
        l.msg();
        //Local inner classes cannot be inovked from outside the method
    }
    public static void main(String[] args) {
            LocalInnerClass obj=new LocalInnerClass();
            obj.display();
    }
}
