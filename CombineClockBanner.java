import java.awt.FlowLayout;
import javax.swing.*;
import practicals.*;
public class CombineClockBanner extends JFrame //making a frame of CombineClockBanner class
{
    Clock c; //creating reference variable of Clock class 
    Banner b;
    public CombineClockBanner(String title)
    {
        setTitle(title);
        setLayout(new FlowLayout());//setting up structure of the widget
        c=new Clock();//c reference variable pointing to memory address of actual class object i.e Clock
        b=new Banner();
        add(c);//adding JPanel clock to the JFrame whose value is getting updated in Clock class as per 1000 millis
        add(b);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CombineClockBanner("Task");//Calling the Constructor of the CombineClassBanner Class
    }
}