package baitap.ss14_thuat_toan_sap_xep;



public class InsertionSort {
    public static void insert(int [] a){
        for (int i=1; i<a.length; i++){
            int ai = a[i];
            int j = i-1;
            while (j>=0 && a[j] >ai ){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] =ai;
            for (int arr : a){
                System.out.print(arr +" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,2,3,99,1,0,4};
        insert(arr);
    }
}
