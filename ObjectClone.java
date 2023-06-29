//Object Cloning is a way to create exact copy of an object.
//Clone() method of a Object Class is used to clone an object
//java.lang.Cloneable interface must be implemented by the class whose object 
//clone we want to create.

class Student18 implements Cloneable
{
    int rollno;
    String name;
    Student18(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    //Why to use clone() method??
    //this saves the extra processing task for creating the extra copy of an object.
    //if we perform it by using the new keyword,it will take a lot of processing to be performed
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class ObjectClone 
{
    public static void main(String[] args) {
        try{
            Student18 obj1=new Student18(101, "anu");
            Student18 obj2=(Student18)obj1.clone();
            System.out.println(obj1.rollno+" "+obj1.name);
            System.out.println(obj2.rollno+" "+obj2.name);
        }
        catch(CloneNotSupportedException c)
        {
System.out.println(c.getMessage());
        }
    }
}