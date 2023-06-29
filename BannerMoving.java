import javax.swing.*;
//import java.util.Arrays;
import java.awt.FlowLayout;
public class BannerMoving extends JFrame implements Runnable
{
    JLabel l;
    // static char[] arr=new char[]{'H','a','r','s','h','i','t','a'};
    // static int len=8;
    static String s1="Welcome to PR3 insitute";
    public BannerMoving(String title)
    {
        super(title);
        // l=new JLabel(Arrays.toString(arr));
        l=new JLabel("Harshita");
        setLayout(new FlowLayout());
        add(l);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        BannerMoving f=new BannerMoving("Banner Moving");
        Thread t=new Thread(f);
        t.start();
    }
    public void run()
    {
        // try
        // {
        //     while(true)
        //     {
        //         s="";

        //         // char temp=arr[0];
        //         // for(int i=0 ; i<len-1 ;i++)
        //         // {
        //         //     arr[i]=arr[i+1];
        //         //     s+=arr[i];
        //         // }
        //         // arr[len-1]=temp;
        //         // s+=arr[len-1];
        //         l.setText(s);
        //         Thread.sleep(200);
        //     }
        // }
        // catch(InterruptedException e)
        // {

        // }
        while(true)
        {
            try
                {
                    Thread.sleep(200);
                    s1=s1.substring(1)+s1.charAt(0);
                    l.setText(s1);
                }
                catch(InterruptedException e)
                {

                }
        }
        
    }
}
