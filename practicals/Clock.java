package practicals;
import java.util.Calendar;
import javax.swing.*;
public class Clock extends JPanel implements Runnable
{
    JLabel l1;

    public Clock()
    {
        Thread t = new Thread(this);
        t.start();
        l1=new JLabel("Clock");
        add(l1);
    }
    public void run()
    {
        while(true)
        {
            Calendar c=Calendar.getInstance();
            String clock=(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
            l1.setText(clock);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                
            }
        } 
    }
}
