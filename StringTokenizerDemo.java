//StringTokenizer class allows an application to break a string into tokens.
import java.util.*;
public class StringTokenizerDemo {
    public static void main(String[] args) {
        //To use String Tokenizer,you specify an input string that contains delimiters
        //Valid delimeters for example: ",;:"
        //Creating a String Tokenizer
        StringTokenizer st=new StringTokenizer("Come,to,learn", ",");
        //counting tokens
        System.out.println("Total tokens : "+st.countTokens());
        //checking Tokens
        while(st.hasMoreTokens())
        {
            System.out.println("Next token : "+st.nextToken());
        }
    }
}
