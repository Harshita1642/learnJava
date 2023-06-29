public class loops {
    public static void main(String[] args) {
        // // loops
        // for(int i=0 ; i<5 ; i++){
        //     for(int j=0 ; j<5 ; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // //arrays
        // int arr[]={1,2,4,5};
        // for(int i=0 ; i<4 ; i++){
        //     System.out.print(arr[i]+" ");
        // }
        
        // String name[]=new String[2];
        // name[0]="Harshita";
        // name[1]="Test";
        // for(int i=0 ; i<name.length ; i++){
        //     System.out.print(name[i]+"\t");
        // }
        // we can take arguments from the command lines so while using the loop we are displaying it 
        // for(int i=0 ; i<args.length ; i++){
        //     System.out.print(args[i]+"\t");
        // }

        // sum of all the arguments given as input
        int count=0;
        for(int i=0 ; i<args.length ; i++){
           count++;
        }
        System.out.println(count);
    }
}
