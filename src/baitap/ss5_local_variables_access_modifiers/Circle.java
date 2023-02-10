package baitap.ss5_local_variables_access_modifiers;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

}
