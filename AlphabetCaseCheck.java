import java.util.Scanner;
public class AlphabetCaseCheck
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a character: ");
        char ch=input.next().trim().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println(ch+" is lowercase character");
        }
        else
        {
            System.out.println(ch+" is uppercase character");
        }
        input.close();
    }
}