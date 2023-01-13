package thuchanh;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if (year%400==0){
            isLeap = true;
        }if (year%4==0&&year%100!=0){
            isLeap = false;
        }
        if (isLeap){
            System.out.println("năm k nhuận");
        }else {
            System.out.println("năm nhuận");
        }
    }
}
