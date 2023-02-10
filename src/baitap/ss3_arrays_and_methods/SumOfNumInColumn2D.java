package baitap.ss3_arrays_and_methods;
import java.util.Scanner;
public class SumOfNumInColumn2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so dong mang 2 chieu:");
        int d = scanner.nextInt();
        System.out.println("Nhap vao so cot mang 2 chieu:");
        int r = scanner.nextInt();
        int[][] arr = new int[d][r];
        for (int i=0; i<d; i++){
            System.out.println("nhap vao "+r +" phan tu dong "+ (i+1));
            for (int j=0; j<r; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Mang vua nhap:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Ban muon tinh tong cot nao ?");
        int col = scanner.nextInt();
        int sum =0;
        for (int i=0; i<d; i++){
            sum+=arr[i][col-1];
        }
        System.out.println("Tong = "+sum);

    }
}
