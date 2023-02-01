package baitap;
import java.util.Scanner;
public class SumOfDiagonalsArr2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap do dai ma tran vuong: ");
        int s = sc.nextInt();
        int[][] myArr =new int[s][s];
        for (int i=0; i<s ; i++){
            System.out.println("Nhap vao "+ s+" phan tu hang "+(i+1));

            for (int j=0; j<s; j++){
                myArr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma tran vuong:");
        for (int i=0; i<s; i++){
            for (int j=0; j<s; j++){
                System.out.print(myArr[i][j] +"\t");
            }
            System.out.println(" ");
        }
        System.out.println("Tong phan tu duong cheo chinh: "+ SumDiagonals(myArr));
    }
    public static int SumDiagonals(int[][] arr ){
        int sum =0;
        for (int i=0; i< arr.length; i++){
                    sum+=arr[i][i];
        }
        return sum;
    }
}
