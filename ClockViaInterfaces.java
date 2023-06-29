import java.util.*;
class CheckTime implements Runnable
{
    public void run() 
    {
        Calendar c=Calendar.getInstance();
        System.out.println("Hour is "+c.get(Calendar.HOUR));
        System.out.println("Minute is "+c.get(Calendar.MINUTE));
        System.out.println("Second is "+c.get(Calendar.SECOND));
    }
}
public class ClockViaInterfaces {
    public static void main(String[] args) throws InterruptedException
    {
        for(int i=0 ; i<10 ; i++)
        {
            CheckTime c=new CheckTime();
            Thread th=new Thread(c);
            th.start();
            Thread.sleep(1000);
        }
    }
}
