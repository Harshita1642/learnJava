
import javax.swing.*;
import java.util.*;
public class DigitalClock extends JFrame implements Runnable 
{
    JLabel l;
    public DigitalClock(String title)
    {
        super(title);
        // Calendar c=Calendar.getInstance();
        l=new JLabel("Clock");
        add(l);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[])
    {
        DigitalClock f=new DigitalClock("Digital Clock");
        Thread t=new Thread(f);
        t.start();
    }
    public void run()
    {
        try{
            while(true)
            {
                Calendar c=Calendar.getInstance();
                String clock=(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                l.setText(clock);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {

        } 
    }
}
