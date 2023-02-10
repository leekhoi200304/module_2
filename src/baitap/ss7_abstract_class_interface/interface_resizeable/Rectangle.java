package baitap.ss7_abstract_class_interface.interface_resizeable;

public class Rectangle extends Shape implements Resizeable {
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


    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public String getName() {
        return "Rectangle: ";
    }

    @Override
    public void resize(double percent) {
        setLength(getLength()+getLength()*(percent/100));
        setWidth(getWidth()+getWidth()*(percent/100));
    }
}
