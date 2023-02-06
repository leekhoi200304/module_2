package baitap;
import java.util.Arrays;
import java.util.Scanner;
public class AddElementArr {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap do dai mang: ");
        int l = sc.nextInt();
        arr = new int[l];
        for (int i=0; i<l; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Mang ban dau: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        arr = Arrays.copyOf(arr, l+1);
        System.out.println("");
        System.out.print("Nhap so can chen: ");
        int num = sc.nextInt();
        System.out.print("Nhap vi tri can chen: ");
        int index = sc.nextInt();
        if (index <0 || index >=arr.length-1){
            System.out.println("Khong chen duoc phan tu vao mang!");
        }else {
            for (int i=arr.length-1; i>index; i--){
                arr[i]=arr[i-1];
            }
            arr[index]=num;
            System.out.print("Mang sau khi chen: ");
            for (int value : arr){
                System.out.print(value+ " ");
            }
        }
    }
}
