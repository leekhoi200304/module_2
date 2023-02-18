package baitap.ss7_abstract_class_interface.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(2.0);
        shape[1] = new Square(3.0);
        shape[2] = new Rectangle(2.0,3.0);
        for (Shape shapes : shape)
            if (shapes instanceof Colorable) {
                System.out.print(shapes.getName());
                ((Colorable) shapes).howToColor();
                System.out.println("S = " + shapes.getArea());
            } else {
                System.out.println(shapes.getName());
                System.out.println("S = " + shapes.getArea());
            }
    }

}
