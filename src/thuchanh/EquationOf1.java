package thuchanh;
import java.util.Scanner;
public class EquationOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        double b=sc.nextDouble();
        double c= sc.nextDouble();
        if (a!=0){
            double x = (c - b) / a;
            System.out.println("nghiệm của phương trình là x = "+x);
        }else {
            if (b==a){
                System.out.println("x nhận mọi giá trị");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }
}
