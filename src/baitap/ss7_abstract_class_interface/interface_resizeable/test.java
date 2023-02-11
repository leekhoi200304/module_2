package baitap.ss7_abstract_class_interface.interface_resizeable;

import baitap.ss7_abstract_class_interface.interface_resizeable.Circle;
import baitap.ss7_abstract_class_interface.interface_resizeable.Rectangle;
import baitap.ss7_abstract_class_interface.interface_resizeable.Shape;
import baitap.ss7_abstract_class_interface.interface_resizeable.Square;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Square square = new Square(3.0);
        Rectangle rectangle = new Rectangle(2.0,3.0);
        Shape[] shape = new Shape[]{circle,square,rectangle};
        System.out.println("Dien tich truoc khi thay doi: " );
        for (Shape shape2 :shape){
            System.out.println(shape2.getName()+shape2.getArea());
        }
        System.out.println();
        System.out.println("Dien tich sau khi thay doi: ");
        circle.resize(Math.random()*100);
        square.resize(Math.random()*100);
        rectangle.resize(Math.random()*100);
        for (Shape shape1 :shape){
            System.out.println(shape1.getName()+shape1.getArea());
        }

    }
}
