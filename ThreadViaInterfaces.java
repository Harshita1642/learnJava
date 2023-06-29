class Mythread implements Runnable
{
    public void run()
    {
        System.out.println("child thread");
    }
}
public class ThreadViaInterfaces {
    public static void main(String[] args) {
        System.out.println("main start");
        Mythread t=new Mythread();
        Thread th=new Thread(t);
        th.start();
        System.out.println("main end");
    }
}
