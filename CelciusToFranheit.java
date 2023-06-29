import java.util.Scanner;
public class CelciusToFranheit {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Pls enter the temperature in celsius: ");
        float tempC=input.nextFloat();
        float tempF;
        tempF=(tempC*9/5)+32;
        System.out.println("temperature in franheit: "+tempF);
        input.close();
    }
}
