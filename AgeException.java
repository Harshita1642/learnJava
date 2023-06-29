import java.util.Scanner;
class AgeParameterException extends Exception
{
    AgeParameterException(String s)
    {
        super(s);
    }
}
public class AgeException {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=input.nextInt();
        input.close();
        try
        {
            if(age<18)
            {
                throw new AgeParameterException("You are under age");
            }
            else
            {
                System.out.println("You can vote");
            }
        }
        catch(AgeParameterException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
