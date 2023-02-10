package baitap.ss3_arrays_and_methods;
import java.util.Scanner;
public class CountOccurOfCharInString {
    static int count;

    public static void main(String[] args) {
        String s = "CodeGym Danang";
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ki tu muon dem: ");
        char k = sc.next().charAt(0);
        count =0;
        for (int i=0; i<s.length(); i++){
            if (k == s.charAt(i)){
                count ++;
            }
        }
        System.out.println("xuat hien "+count+" lan trong chuoi");
    }
}
