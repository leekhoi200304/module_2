package baitap.ss5_local_variables_access_modifiers.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
//    private boolean filled;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
//        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

}
