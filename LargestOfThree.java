import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is largest");
        }
        else if(b>c)
        {
            System.out.println(b+" is largest");
        }
        else
        {
            System.out.println(c+" is largest");
        }
        // max function of Math class can also be used to find largest among two numbers we can use it two times
        // to find between three nos 
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max+" is largest calculated using max fnc of Math class present in java.lang package");
        input.close();
    }
}
