package baitap.ss7_abstract_class_interface.interface_colorable;

public class Square extends Shape implements Colorable{
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return size*size;
    }

    @Override
    public String getName() {
        return "Square: ";
    }
}
