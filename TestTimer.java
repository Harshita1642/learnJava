import java.awt.FlowLayout;
import javax.swing.*;
public class TestTimer extends JFrame
{
    Timer t;
    public TestTimer()
    {
        t=new Timer();
        setLayout(new FlowLayout());
        add(t);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TestTimer();
    }
}
