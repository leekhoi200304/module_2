package baitap.ss6_inheritancee.circle_cylinder;

import baitap.ss6_inheritancee.circle_cylinder.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(){}

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", the tich = "+this.getVolume()+'\''+
                '}';
    }
}
