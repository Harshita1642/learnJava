class Person
{
    int addhar_no;
    String name;
    Person(int addhar_no,String name){
        this.addhar_no=addhar_no;
        this.name=name;
    }
}
class Employee extends Person
{
    int salary;
    Employee(int salary,int addhar_no,String name){
        super(addhar_no, name);
        this.salary=salary;
    }
}
class Ceo extends Employee
{
    int bonus;
    Ceo(int addhar_no,String name,int Salary,int bonus){
        super(Salary, addhar_no, name);
        this.bonus=bonus;
    }
    void displaydetails(){
        System.out.println("Employee's name: "+name+"\nEmployee's Addhar Number: "+addhar_no+"\nEmployee's salary: "+salary+"\nEmployee's bonus: "+bonus);
    }
}
public class multipleInheritancetask {
    public static void main(String[] args) {
        Ceo c=new Ceo(123456, "harshita", 75000, 25000);
        c.displaydetails();
    }
}
