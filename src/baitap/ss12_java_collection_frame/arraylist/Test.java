package baitap.ss12_java_collection_frame.arraylist;

import baitap.ss12_java_collection_frame.arraylist.ProductManager;

import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        while (true){
            System.out.println("1. Them San Pham");
            System.out.println("2. Sua Thong Tin San Pham");
            System.out.println("3. Xoa San Pham");
            System.out.println("4. Hien Thi Danh Sach San Pham");
            System.out.println("5. Tim Kiem San Pham");
            System.out.println("6. Sap Xep San Pham Tang Dan");
            System.out.println("7. Sap Xep San Pham Giam Dan");
            System.out.println("8. Thoat");
            System.out.println("Nhap vao lua chon: ");
            short choice = scanner.nextShort();
            switch (choice){
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.removeProduct();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    productManager.ProductSortUp();
                    break;
                case 7:
                    productManager.ProductSortDown();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("not choice");
            }
        }
    }
}
