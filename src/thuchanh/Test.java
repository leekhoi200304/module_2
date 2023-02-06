package thuchanh;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(8,2);
        System.out.println(cylinder.getArea());
    }
}
