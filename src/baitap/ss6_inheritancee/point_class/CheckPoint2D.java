package baitap.ss6_inheritancee.point_class;
import java.util.Arrays;
public class CheckPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(2,3);
        point2D1.setXY(10,23);
        System.out.println(Arrays.toString(point2D1.getXY()));
    }
}
