import javax.swing.*;
import javafx.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
public class Timer extends JPanel implements Runnable
{
    JLabel l;
    public Timer()
    {
        Thread t=new Thread(this);
        t.start();
        l=new JLabel("4:00");
        add(l);
    }
    public void run()
    {
        int secs=0;
        int mins=4;
        while(mins>0)
        {
            mins--;
            secs=59;
            while(secs>=0)
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {

                }
                
                l.setText(mins+":"+secs);
                //System.out.println(mins+":"+secs);
                secs--;
            } 
        }
        // addActionListener();
    }
    // public void actionPerformed(ActionEvent e)
    // {
    //     JOptionPane.showMessageDialog(null,"TIME OUT!!");
    // }
}