package baitap;
import java.util.Scanner;
public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền USD: ");
        double USD = scanner.nextDouble();
        double rate = USD * 23000;
        System.out.println("Giá trị VND: "+ rate);
    }
}
