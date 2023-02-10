package baitap.ss7_abstract_class_interface.interface_resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius*radius;
    }

    @Override
    public String getName() {
        return "Circle: ";
    }

    @Override
    public void resize(double percent) {
        setRadius(this.radius+this.radius*(percent/100));

    }
}
