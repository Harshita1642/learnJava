import java.util.*;
//Scanner class can parse primitive types and strings using regular expressions
//Scanner breaks its input into tokens using delimeter which bydefault matches whitespace
public class ScannerDemo {
    public static void main(String[] args) {
        String s = "Hello World! 3 + 3.0 = 6 ";
        //create a new scanner with the specified String Object
        Scanner scanner=new Scanner(s);
        //find the next token and print it
        System.out.println(""+scanner.next());//Hello
        //find the next token and print it
         System.out.println(""+scanner.next());//World
         System.out.println(""+scanner.next());//3
         System.out.println(""+scanner.next());//+
         System.out.println(""+scanner.next());//3.0
         System.out.println(""+scanner.next());//=
         System.out.println(""+scanner.next());//6
         //Scanner class to get input from user
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Roll, Marks and name ");
         int a=sc.nextInt();
         double d=sc.nextDouble();
         String str=sc.next();
         System.out.println("Roll: "+a+" Marks: "+d+" Name: "+str);
    }
}
