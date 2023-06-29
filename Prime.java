import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        if(num<=1)
        {
            System.out.println("Neither prime nor composite");
        }
        else
        {
            int i;
            for(i=2 ; i<num/2 ; i++)
            {
                if(num%i==0)
                {
                    System.out.println("Not a Prime number");
                    break;
                }
                else
                {
                    continue;
                }
            }
            if(i==(num/2))
            {
                System.out.println("Prime number");
            }
        }
        input.close();
    }
}
