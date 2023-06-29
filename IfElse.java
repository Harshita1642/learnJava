import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary=input.nextInt();
        //if-else
        if(salary<=10000)
        {
            salary+=1000;
        }
        else
        {
            salary+=500;
        }
        System.err.println("Incremented Salary by creteria 1: "+salary);
        //multiple if-else: if-else-if ladder
        if(salary<=10000)
        {
            salary+=1000;
        }
        else if(salary<=20000)
        {
            salary+=700;
        }
        else
        {
            salary+=500;
        }
        System.err.println("Incremented Salary by creteria 2: "+salary);
        input.close();
    }
}
