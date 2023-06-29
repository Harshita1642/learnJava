import java.io.*;
public class BufferReaderWriterExample {
    public static void main(String[] args) throws Exception
    {
        FileWriter writer=new FileWriter("testout.txt");
        BufferedWriter buffer=new BufferedWriter(writer);
        buffer.write("Welcome to PR3 Training Institute");
        buffer.close();
        System.out.println("Success write");
        BufferedReader buf=new BufferedReader(new FileReader("testout.txt"));
        String line;
        while(!((line=buf.readLine())==null))
        {
            System.out.println(line);
        }
        buffer.close();
    }
}
