package baitap.ss4_oop;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return (b*b)-(4*a*c);
    }

    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant())) / (2*a);
    }

    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())) / (2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("nhap so c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta = "+ delta);
        if (delta > 0){
            System.out.println("Phuong trinh co 2 nghiem: "+ quadraticEquation.getRoot1()+ " and "+quadraticEquation.getRoot2());
        }else if (delta == 0){
            System.out.println("Phuong trinh co 1 nghiem: "+ quadraticEquation.getRoot1());
        }else {
            System.out.println("Phuong trinh vo nghiem.!!!");
        }
    }
}


