package thuchanh;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius=radius;
        this.color= color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
