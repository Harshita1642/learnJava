
public class TestThreadPrio extends Thread
{
    public void run()
    {
        System.out.println("Name "+this.getName()+"\nPriority "+this.getPriority());
    }
    public static void main(String[] args) {
        //TODO Auto-generated method sub
        TestThreadPrio t1=new TestThreadPrio();
        TestThreadPrio t2=new TestThreadPrio();
        TestThreadPrio t3=new TestThreadPrio();
        t1.setPriority(3);
        t3.setPriority(4);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
