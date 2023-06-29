class Mythread extends Thread
{
    public void run()
    {
        System.out.println("child thread");
    }
}
public class UsingThrowsInterruptedException
{
    public static void main(String[] args)  throws InterruptedException
    {
        System.out.println("main start");
        Mythread t=new Mythread();
        t.start();
        Thread.sleep(1000);
    }
}
