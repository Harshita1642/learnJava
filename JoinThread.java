
public class JoinThread extends Thread
{
    public static void main(String[] args) 
    {
        int s=1;
        JoinThread p1=new JoinThread();
        p1.setName("Thread"+s++);
        JoinThread p2=new JoinThread();
        p2.setName("Thread"+s++);
        JoinThread p3=new JoinThread();
        p3.setName("Thread"+s++);
        p1.start();
        try{
            p1.join();
        }
        catch(InterruptedException e)
        {
        }
        p2.start();
        p3.start();
    }
        public void run() 
        {
            for(int i=1;i<=3;i++)
            {
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                }
                System.out.println(this.getName()+"="+i);
            }
        }
}
