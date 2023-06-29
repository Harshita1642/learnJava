import java.util.*;
// class divide
// {
//     int a,b;
//     divide(int a,int b){
//         this.a=a;
//         this.b=b;
//     }
//     int  giveResult(){
//         int ans=a/b;
//         try {
//             return ans;
//         } catch (ArithmeticException e) {
//             // TODO: handle exception
//             System.out.println(e.getMessage());
//         }
//         try{

//         }
//     }

// }
public class BeginExceptionHandling {
    public static void main(String[] args) {
        //try
        // {
        //     Scanner s=new Scanner(System.in);
        //     System.out.println("Input two nos");
        //     int a=s.nextInt();
        //     int b=s.nextInt();
        //     int ans=a/b;
        //     System.out.println(a+" / "+b+"="+" "+ans);
        //     s.close();
        // }
        // catch(ArithmeticException e )
        // {
        //     System.out.println(e.getMessage());
        // }
        // catch(InputMismatchException e1)
        // {
        //     System.out.println(e1.getMessage());
        // }
        // System.out.println("end of the code");

        //array
        // try
        // {
        //     int ans;
        //     int a=Integer.parseInt(args[0]);
        //     int b=Integer.parseInt(args[1]);
        //     ans=a/b;
        //     System.out.println("answer is "+ans);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e.getMessage());
        // }
        // catch(InputMismatchException e1)
        // {
        //     System.out.println(e1.getMessage());
        // }
        // catch(ArrayIndexOutOfBoundsException e2)
        // {
        //     System.out.println(e2.getMessage());
        // }
        // System.out.println("end of the code");


        //need to check every exception
        try
        {
            int ans;
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            try
            {
                ans=a/b;
                System.out.println("answer is "+ans);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch (InputMismatchException e1)
        {
            e1.getMessage();
        }
        catch (ArrayIndexOutOfBoundsException e2)
        {
            System.out.println(e2.getMessage());
        }
        catch (NumberFormatException e3)
        {
            System.out.println(e3.getMessage());
        }
        
        System.out.println("end of the code");
    }
    
}
