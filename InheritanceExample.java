class Box {
     private double width;
     private double height;
     private double depth;

     // construct clone of an object

     Box(Box ob) { // pass object to constructor
       width = ob.width;
       height = ob.height;
       depth = ob.depth;
     }
}

class BoxWeight extends Box {
     double weight; // weight of box

     // construct clone of an object

     BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
     }
//Notice that super() is passed an object of type BoxWeight—not of type Box.This still invokes the constructor Box(Box ob).
// NOTE: A superclass variable can be used to reference any object derived from that class.
// Thus, we are able to pass a BoxWeight object to the Box constructor.Of course,Box only has knowledge of its own members.

}
public class InheritanceExample {
    public static void main(String[] args) {
        
    }
}
