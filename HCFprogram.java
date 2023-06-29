import java.util.Scanner;
public class HCFprogram
{
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      System.out.println("Enter two numbers: ");
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      int num;
      if(a>b && a>c)
      {
        num=a;
      }
      else if(b>c)
      {
        num=b;
      }
      else
      {
        num=c;
      }
      int ans=1;
      for(int i=2 ; i<num ; i++)
      {
        if(a%i==0 && b%i==0 && c%i==0)
        {
            ans=i;
        }
      }
      System.out.println("HCF of three numbers is "+ans);
      input.close();  
    }
}