import java.util.Scanner;
class NegativeNumberException extends Exception
{
    NegativeNumberException(String n)
    {
        super(n);
    }
}
public class UserDefinedExceptions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a positive number: ");
        int num=input.nextInt();
        input.close();
        try
        {
            // System.out.println("number is "+num);
            if(num<0)
            {
                throw new NegativeNumberException("Negative number not allowed");
            }
            else
            {
                System.out.println("Number is "+num);
            }
            
        }
        catch(NegativeNumberException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
