package baitap;
import java.util.Scanner;
public class FindMinArr {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int size = sc.nextInt();
        arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Nhap phan tu thu "+(i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i=0; i<size; i++){
            if (min>arr[i]){
                min =arr[i];
            }
        }
        System.out.println("phan tu nho nhat trong mang: "+min);
    }
}
