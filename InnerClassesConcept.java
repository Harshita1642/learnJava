public class InnerClassesConcept {
    private int data=30;
    class Inner //Inner class or nested class is a class i.e declared inside the class or interface
    {
        void msg()
        {
            System.out.println("data is "+data);
        }
    }
    //Use of Inner classes: to group classes interface in one place and all the members of outer class 
    //including private members & methods
    public static void main(String[] args) {
        InnerClassesConcept obj=new InnerClassesConcept();
        InnerClassesConcept.Inner in=obj.new Inner();
        in.msg();
    }
    //Advantages:
    //1)Nested classes represents a special type of relationship that is it can access all the members of outer class
    //2)It develops readability and maintainablity of code and lead to Code optimisation as well
}