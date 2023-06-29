class Mythread extends Thread
{
    public void run()
    {
        System.out.println("child thread");
    }
}
public class threadingone {
    public static void main(String[] args) 
    { 
        System.out.println("main start");
        Mythread t=new Mythread();
        t.start(); //thread t is going in ready queue using start() predefined fnc
        try{
            Thread.sleep(1000); // to preempt the mythread process in between main and main will be in suspended wait for 1000 millis
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
            //InterruptedException is the catchable exception which creates error during compile time
            // Uncatchable exception creates error during run time
            // InterruptedException came during interuption means preemption this should be catchable due to deadlock avoidance.
        }

        // t.run();
        System.out.println("main end");
    }
}
