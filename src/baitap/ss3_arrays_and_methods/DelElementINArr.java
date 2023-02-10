package baitap.ss3_arrays_and_methods;
import java.util.Arrays;
import java.util.Scanner;
public class DelElementINArr {
    static int[] arr;
    static int index;
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
        System.out.println("");
        System.out.print("nhap phan tu muon xoa: ");
        int n = sc.nextInt();
        for (int i=0; i<arr.length; i++){
            if (n==arr[i]){
                index= i;
            }
        }
        for (int i=index; i<arr.length-1; i++ ){
             arr[i]=arr[i+1] ;
        }
        arr[arr.length-1]=0;
        arr = Arrays.copyOf(arr,l-1);
        System.out.print("Mang sau khi xoa: ");
        for (int value : arr){
            System.out.print(value+ " ");
        }
    }
}
