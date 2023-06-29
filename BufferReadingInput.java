//By wrapping the System.in in an InputStreamReader which is wrapped in a BufferReader
//we can read input from the user in the command line.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class BufferReadingInput {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name: ");
        String name;
        while(!(name=reader.readLine()).equals("stop"))
        {
            System.out.println("Your name is "+name);
        }
    }
}
