import java.util.Scanner;
public class FibbonacciNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter n to find nth fibbonacci number: ");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int temp;
        for(int i=2 ; i<n ; i++)
        {
            temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println("nth term: "+b);
        input.close();
    }
}
