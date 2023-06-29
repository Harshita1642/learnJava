import java.util.Scanner;
public class CountingOccurence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //“ Input two numbers, find that how many times second number digit is present in first number”
        System.out.println("enter the first number: ");
        int a=input.nextInt();
        System.out.println("enter the number whose occurence u want to find: ");
        int b=input.nextInt();
        int count=0;
        while(a>0)
        {
            if(a%10==b)
            {
                count++;
            }
            a=a/10;
        }
        System.out.println("Counting occurence of "+b+": "+count);
        input.close();
    }
}
