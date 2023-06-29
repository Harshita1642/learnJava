class Multi extends Thread
{
    int time;
    Multi(int time)
    {
        this.time=time;
    }
    public void run()
    {
        try{
            for(int i=0 ; i<10 ; i++)
            {
                Thread.sleep(time);
                System.out.println("thread is running...."+i);
            }
        }
        catch(InterruptedException e)
        {

        }
        
    }
}
public class threadingtwo {
    public static void main(String[] args) {
        System.out.println("main start");
        Multi t1=new Multi(500);
        Multi t2=new Multi(200);
        t1.start();
        t2.start();
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
        System.out.println("main end ");
    }
}
