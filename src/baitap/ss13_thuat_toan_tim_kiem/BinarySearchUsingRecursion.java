package baitap.ss13_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int n;
        do {
            System.out.println("Nhap so luong phan tu cua mang: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n<0){
                System.out.println("Moi nhap lai!!");
            }
        }while (n<0);
        arr = new int[n];
        int l = arr.length;
        System.out.println("Nhap vao "+n +" phan tu cua mang");
        for (int i=0; i<l; i++){
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println("Mang cua sau khi sap xep");
        for (int arr1 : arr){
            System.out.print(arr1 +" ");
        }
        System.out.println("Nhap so can tim trong mang");
        int num = scanner.nextInt();
        int result = binarySearch(arr,0, l-1, num);
        if (result == -1){
            System.out.println("not found");
        }else
            System.out.println("Element found at index " +result);


    }
    public static int binarySearch(int[] array, int left, int right , int value){
        if (left < right){
            int middle = (left + right)/2;
            if (array[middle] == value){
                return middle;
            }
            if (value >array[middle]){
                return binarySearch(array, middle+1, right,value);
            } else {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }
}
