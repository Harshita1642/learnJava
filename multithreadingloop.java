class Mythread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0 ; i<10 ; i++)
            {
                Thread.sleep(500);
                System.out.println("child thread1 "+i);
            }
        }
        catch(InterruptedException e)
        {

        }
        
    }
}
class Mythread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0 ; i<10 ; i++)
            {
                Thread.sleep(200);
                System.out.println("child thread2 "+i);
            }
        }
        catch(InterruptedException e)
        {

        }
        
    }
}
public class multithreadingloop {
    public static void main(String[] args) {
        System.out.println("main start");
        Mythread1 t=new Mythread1();
        Mythread2 t1=new Mythread2();
        t.start(); 
        t1.start();
        try
        {
            for(int i=0 ; i<10 ; i++)
            {
                Thread.sleep(1000);
                System.out.println("main thread "+i);
            }
        }
        catch(InterruptedException e)
        {

        }
        System.out.println("main end");
    }
}
