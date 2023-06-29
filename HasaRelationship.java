class Address
{
    private
    int pincode;
    int h_no;
    String city="Sangrur";
    Address(int pincode,int h_no,String city){
        this.pincode=pincode;
        this.h_no=h_no;
        this.city=city;
    }
    void display(){
        System.out.println("Pincode is "+pincode);
        System.out.println("H_no is "+h_no);
        System.out.println("City is "+city);
    }
}
class Employee 
{
    String name;
    int Salary;
    Address e;
    Employee(String name,int Salary, Address e){
        this.name=name;
        this.Salary=Salary;
    }
    void displaydetails(){
        System.out.println(name+" earning "+Salary);
    }
}
public class HasaRelationship {
    public static void main(String[] args) {
        Address a1=new Address(1, 2, "Mgdt");
        a1.display();
        Employee e1=new Employee("harshita", 45000,a1);
        e1.displaydetails();
        Address a2=new Address(34, 5, "htdtdd");
        a2.display();
        Employee e2=new Employee("harshita", 45000,a2);
        e2.displaydetails();
        //a class have an entity reference ,it is known as Aggregation.Aggregation represents a HAS-A relationship
        //code reuse is also best achieved by aggregation whwn there is no IS_A relationship
    }
}
