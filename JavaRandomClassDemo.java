import java.util.Random;
public class JavaRandomClassDemo {
        public static void main(String[] args) {
            //run 20 random examples
            int numTests=20;
            //create a new Java Random object
            Random random=new Random();
            for(int i=0 ; i<numTests ; i++)
            {
                //get the random int
                int randomInt=random.nextInt(100);
                System.out.format("test %2d,randomInt=%d\n",i+1,randomInt);
            }
        }
}
