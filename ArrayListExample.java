
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        //Creation of ArrayList: I'm going to add String elements so I made it of String type
        ArrayList<String> obj=new ArrayList<>();
        //This is how elements should be added to the ArrayList
        obj.add("Ajett");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anu");
        //Displaying array list elements
        System.out.println("Currently the array list has following elements: "+obj);
        //Add element at the given index
        obj.add(0,"Rahul");
        obj.add(1,"Justin");
        System.out.println("Currently the array list has following elements: "+obj);
        //Remove the elements from array list like this
        obj.remove("Harry");
        obj.remove("Chaitanya");
        System.out.println("Currently the array list has following elements: "+obj);
        //Remove elements from the given index
        obj.remove(1);
        System.out.println("Current array list is:"+obj);
    }
}
