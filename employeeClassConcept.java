class Employee
{
    int employee_id,salary;
    String name;
    Employee(int employee_id,int salary,String name){
        this.employee_id=employee_id;
        this.salary=salary;
        this.name=name;
    }
    void displaydetails(){
        System.out.println("Employee Id: "+employee_id+"\nEmployee Name: "+name+"\nEmployee Salary: "+salary);
    }
}
public class employeeClassConcept{
    public static void main(String[] args) {
        Employee e=new Employee(01,50000,"Harshita");
        e.displaydetails();
    }
}