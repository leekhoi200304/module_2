package baitap.ss7_abstract_class_interface.interface_colorable;

public class Rectangle extends Shape implements Colorable{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String getName() {
        return "Rectangle: ";
    }
}
