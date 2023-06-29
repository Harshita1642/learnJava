import java.util.Scanner;
class Fact
{
    int n;
    Fact(int n)
    {
        this.n=n;
    }
    int factorial()
    {
        int ans=1;
        for(int i=2 ; i<=n ; i++)
        {
            ans*=i;
        }
        return ans;
    }
}
public class Ncr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=input.nextInt();
        System.out.println("enter the value of r:");
        int r=input.nextInt();
        Fact f_n=new Fact(n);
        int F_n=f_n.factorial();
        Fact f_r=new Fact(r);
        int F_r=f_r.factorial();
        Fact f_nr=new Fact(n-r);
        int F_nr=f_nr.factorial();
        int Ncr=F_n/(F_r*F_nr);
        System.out.println("Ncr = "+Ncr);
        input.close();
    }
}
