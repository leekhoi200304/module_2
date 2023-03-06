package baitap.ss15_exception_debug;
import java.util.Scanner;

public class Triangle {
    public static int input(String sth){
        System.out.print(sth);
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value <0 ){
                    throw new IllegalTriangleException("Canh tam giac phai la so duong. Moi nhap lai!!!");
                }
                return value;
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Moi nhap vao so nguyen duong!!!");
            }
        }
    }
    public static void main(String[] args) {
        int a = input("Nhap vao canh thu 1: ");
        int b = input("Nhap vao canh thu 2: ");
        int c = input("Nhap vao canh thu 3: ");
        try {
            if (a+b<=c || a+c<=b || b+c<=a){
                throw new IllegalTriangleException("3 canh vua nhap khong khong phai 1 tam giac!!!");
            }
            System.out.println("3 canh tren la 1 tam giac");
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
