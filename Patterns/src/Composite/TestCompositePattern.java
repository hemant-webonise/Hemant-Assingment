package Composite;

/*Composite pattern is one of the Structural design
 * pattern and is used when we have to represent a
 * part-whole hierarchy. When we need to create a structure 
 * in a way that the objects in the structure has to be treated 
 * the same way, we can apply composite design pattern.

Lets understand it with a real life example – A diagram is a structure 
that consists of Objects such as
Circle, Lines, Triangle etc and when we fill the drawing 
with color (say Red), the same color also gets applied 
to the Objects in the drawing. 
Here drawing is made up of different parts and they 
all have same operations.

Composite Pattern consists of following objects.

    Base Component(Shape) – Base component is the interface for 
    all objects in the composition, client program uses base component 
    to work with the objects in the composition.
    It can be an interface or an abstract class 
    with some methods common to all the objects.
    Leaf(Triangle , circle) – Defines the behavior for the elements
    in the composition. It is the building block for 
    the composition and implements base component. 
    It doesn’t have references to other Components.
    Composite(Drawing) – It consists of leaf elements and implements 
    the operations in base component.
*/
 
public class TestCompositePattern {
 
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();
         
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);
         
        drawing.draw("Red");
         
        drawing.clear();
         
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
 
}