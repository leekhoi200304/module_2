package baitap.ss3_arrays_and_methods;
import java.util.Scanner;
public class MergeArr {
    static int[] arr1;
    static int[] arr2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap do dai mang 1: ");
        int l1= sc.nextInt();
        arr1= new int[l1];
        for (int i=0; i<l1; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Nhap do dai mang 2");
        int l2=sc.nextInt();
        arr2= new int[l2];
        for (int i=0; i<l2; i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3 = new int[l1+l2];
        int count =0;
        for (int value : arr1){
            arr3[count] = value;
            count ++;
        }
        for (int value : arr2){
            arr3[count] = value;
            count++;
        }
        System.out.println("Mang sau khi gop: ");
        for (int value : arr3){
            System.out.print(value+ " ");
        }
    }
}
