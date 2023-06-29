import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        //A number I input from the keyboard and Show the output as Reverse of that number “ 
// Example :- Input :- 12345 
//  Output :- 54321 
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=input.nextInt();
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number is "+rev);
        input.close();
    }
}
