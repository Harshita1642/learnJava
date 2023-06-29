public class InstanceOfOperator {
    //java instanceof operator is used to test whetherthe object is an instance of the specified type(class or suclass or interface) 
    public static void main(String[] args) {
        //instanceof is a comparison operator as it compares with the instance with the type. 
        //if we apply instanceof operator with any variable that has null value it returns false
        InstanceOfOperator i=new InstanceOfOperator();
        System.out.println(i instanceof InstanceOfOperator);//true
    }
}
