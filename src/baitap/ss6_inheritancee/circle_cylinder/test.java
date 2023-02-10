package baitap.ss6_inheritancee.circle_cylinder;

import baitap.ss6_inheritancee.circle_cylinder.Cylinder;

public class test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(2.0);
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(1.0, "red", 2.0);
        System.out.println(cylinder2);
    }
}
