import java.util.Scanner;
public class SumViaEndlessLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num,sum=0,largest=-1;
        do
        {
            System.out.println("enter the number: ");
            num=input.nextInt();
            sum+=num;
            if(num>largest)
            {
                largest=num;
                //System.out.println(largest);
            }
        }
        while(num!=0);
        System.out.println("Sum of the entered numbers: "+sum);
        System.out.println("Largest number: "+largest);
        input.close();
    }
}
