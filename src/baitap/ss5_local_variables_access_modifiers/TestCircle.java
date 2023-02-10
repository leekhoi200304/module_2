package baitap.ss5_local_variables_access_modifiers;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getColor() + "-" + circle.getRadius());
        Circle circle1 = new Circle(3.0);
        System.out.println(circle1.getRadius());

    }
}
