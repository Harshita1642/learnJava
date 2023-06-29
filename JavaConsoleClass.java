//The java class is to be used to get input from console.It provides methods to texts & passwords
//If you read password using Concole class,it will not be displayed to the user
//the java.io.Console class is attached the system console internally
import java.io.Console;

public class JavaConsoleClass {
    public static void main(String[] args) {
        String text=System.console().readLine();
        System.out.println("Text is "+text);
        Console console=System.console();
        System.out.println("enter your password: ");
        char[] password=console.readPassword();
        System.out.println("Password is "+String.valueOf(password));
        String num1=System.console().readLine();
        String num2=System.console().readLine();
        System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
        System.out.println(Float.parseFloat(num1)+Float.parseFloat(num2));
        System.out.println("enter your name ");
        String name=System.console().readLine();
        System.out.println(name.charAt(3));
    }
}
