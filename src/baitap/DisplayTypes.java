package baitap;
import java.util.Scanner;
public class DisplayTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice=-1;

        while (choice !=0){
            System.out.println("1.in hinh chu nhat");
            System.out.println("2.in hinh tam giac vuong botton-left");
            System.out.println("3.in hinh tam giac vuong top-left");
            System.out.println("4.in hinh tam giac can");
            System.out.println("0.thoat");
            System.out.print("Enter your choice: ");
            choice=input.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Nhap chieu dai: ");
                    int d = input.nextInt();
                    System.out.print("Nhap chieu rong: ");
                    int r = input.nextInt();
                    for (int i=1; i<=d;i++){
                        for (int j=1; j<=r; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("Nhap so dong: ");
                    int D = input.nextInt();
                    for (int i=1; i<=D; i++){
                        for (int j=1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.print("Nhap so dong: ");
                    int line = input.nextInt();
                    for (int i=line; i>=1; i--){
                        for (int j=1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.print("Nhap so dong: ");
                    int h = input.nextInt();
                    for (int i=1; i<=h; i++){
                        for (int j=1; j<=h-i; j++){
                            System.out.print("  ");
                        }
                        for (int j=1; j<=2*i-1; j++){
                            System.out.print("* ");
                        }
//                        for (int k=1; k<=h-i; k++){
//                            System.out.print(" ");
//                        }
                        System.out.println("");
                    }
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
