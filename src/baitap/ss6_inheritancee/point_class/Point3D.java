package baitap.ss6_inheritancee.point_class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public  Point3D(){}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),this.getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + this.getZ() +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);

    }
}
