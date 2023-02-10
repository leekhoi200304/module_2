package baitap.ss3_arrays_and_methods;
import java.util.Scanner;
public class FindMaxArr2D {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap vao so dong mang 2 chieu:");
        int d = sc.nextInt();
        System.out.println("Nhap vao so cot mang 2 chieu:");
        int r = sc.nextInt();
        arr = new int[d][r];
        for (int i=0; i<d; i++){
            System.out.println("nhap vao "+r +" phan tu dong "+ (i+1));
            for (int j=0; j<r; j++){
                arr[i][j]=sc.nextInt();
            }
        }
//         int[][] arr ={{1,2,3,99},{4,5,6,11},{7,8,9,12}};
         int max= arr[0][0];
         for (int i=0; i<arr.length; i++){
             for (int j=0; j<arr[i].length; j++){
                 if (max<arr[i][j]){
                     max = arr[i][j];
                 }
             }
         }
        System.out.println("So lon nhat trong mang 2D: "+max);
    }
}
