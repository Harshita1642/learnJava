import java.util.*;
public class TestCalender {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        //getInstance is used to pick up the current date and time
        System.out.println("Date is "+c.get(Calendar.DATE));
        System.out.println("/"+c.get(Calendar.MONTH));
        System.out.println("/"+c.get(Calendar.YEAR));
        System.out.println("Hour is "+c.get(Calendar.HOUR));
        System.out.println("Minute is "+c.get(Calendar.MINUTE));
        System.out.println("Second is "+c.get(Calendar.SECOND));
    }
}
