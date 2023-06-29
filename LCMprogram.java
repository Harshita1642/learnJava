import java.util.Scanner;
public class LCMprogram {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int num=0,lcm=1;
        if(a<b && a<c)
        {
            num=a;
        }
        else if(b<c)
        {
            num=b;
        }
        else
        {
            num=c;
        }
        while(true)
        {
            if(num%a==0 && num%b==0 && num%c==0)
            {
                lcm=num;
                System.out.println("LCM of three numbers is "+lcm);
                break;
            }
            num++;
        }
        input.close();
    }
}
