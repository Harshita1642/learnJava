package practicals;
import javax.swing.*;
public class Banner extends JPanel implements Runnable
{
    JLabel l;
    static String s1 = "Welcome to Pr3 Institute   ";
    public Banner() 
    {
        Thread t = new Thread(this);//here this is pointing to the Banner class
        t.start();//here t.start() is referring to the Banner class's run() fnc
        l = new JLabel("");//intialising a label to the JPanel 
        add(l);//adding the content to the label of the JPanel
    }
    public void run()
    {
        while(true)
        {
            try
            {
            Thread.sleep(200); //put the process in waiting state for 200 millis to observe banner moving
            s1=s1.substring(1)+s1.charAt(0);//here left shifting the elements of string from 1 to n-1
            //and concatenating char of index 0 at last 
            l.setText(s1);//overriding the content of label l
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}