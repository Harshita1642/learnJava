//import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;
class PassLengthException extends Exception
{
    PassLengthException(String s)
    {
        super(s);
    }
}
public class TaskOnExceptions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //System.out.println("enter a your password: ");
        try
        {
            char[] pass=new char[10];
            System.out.println("Enter the value of n: ");
            int n;
            n=input.nextInt();
            System.out.println("Enter the n characters: ");
            for(int i=0;i<n;i++)
            {
                pass[i]=input.next().trim().charAt(0);
            }
            input.close();
            try
            {
                if(n!=8)
                {
                    throw new PassLengthException("Your should password contain eight characters");
                }
                for(int i=0 ; i<n ; i++)
                {
                    if(pass[i]>'0' ||  pass[i]<'9')
                    {
                        throw new PassLengthException("Your password should contain atleast one numeric value");
                    }
                    else
                    {
                        continue;
                        
                    }
                }
            }
            catch(PassLengthException e1)
            {
                System.out.println(e1.getMessage());
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("password checked");
        }
    }
}
