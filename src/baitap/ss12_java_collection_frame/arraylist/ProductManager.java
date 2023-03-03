package baitap.ss12_java_collection_frame.arraylist;

import baitap.ss12_java_collection_frame.arraylist.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> arrayList;

    public ProductManager() {
        this.arrayList = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public Product inFo(){
        System.out.println("Nhap id san pham: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product p = new Product(id,name,price);
        return p;
    }

    public void addProduct(){
        Product product = this.inFo();
        this.arrayList.add(product);
        System.out.println("Them san pham thanh cong!!!");
    }

    public void showProduct(){
        System.out.println("DANH SACH SAN PHAM: ");
        for (Product product : arrayList){
            System.out.println(product);
        }
        System.out.println();
    }

    public void editProduct(){
        int id;
        boolean check = false;
        do {
            System.out.println("Nhap id: ");
            id = scanner.nextInt();
            scanner.nextLine();
            for (int i=0; i<arrayList.size(); i++){
                if (arrayList.get(i).getId() == id){
                    System.out.println("nhap ten moi cho san pham: ");
                    String name = scanner.nextLine();
                    arrayList.get(i).setName(name);
                    System.out.println("nhap gia moi cho san pham: ");
                    double price = scanner.nextDouble();
                    arrayList.get(i).setPrice(price);
                    check = true;
                }
            }
            if (!check){
                System.out.println("Moi nhap lai: ");
            }

        }while (!check);
        showProduct();
    }

    public void removeProduct(){
        System.out.println("Nhap vao id san pham muon xoa: ");
        int id = scanner.nextInt();
        for (int i=0; i<arrayList.size(); i++){
            if (arrayList.get(i).getId() == id){
                arrayList.remove(i);
            }
        }
        showProduct();
    }

    public void searchProduct(){
        System.out.println("Nhap vao ten san pham can tim kiem: ");
        String name = scanner.nextLine();
        for (int i=0; i<arrayList.size(); i++){
            if (arrayList.get(i).getName().contains(name)){
                System.out.println(arrayList.get(i));
            }
        }
    }

    public void ProductSortUp(){
        ProductSortByPriceUp priceUp = new ProductSortByPriceUp();
        arrayList.sort(priceUp);
        showProduct();
    }

    public void ProductSortDown(){
        ProductSortByPriceDown priceDown = new ProductSortByPriceDown();
        arrayList.sort(priceDown);
        showProduct();
    }
     public static class ProductSortByPriceUp implements Comparator<Product> {
         @Override
         public int compare(Product o1, Product o2) {
            if (o1.getPrice() == o2.getPrice()){
                return 0;
            }else if (o1.getPrice() < o2.getPrice()){
                return -1;
            }else {
                return 1;
            }
         }
     }

     public static class ProductSortByPriceDown implements Comparator<Product>{

         @Override
         public int compare(Product o1, Product o2) {

             if (o1.getPrice() == o2.getPrice()){
                 return 0;
             }else if (o1.getPrice() < o2.getPrice()){
                 return 1;
             }else {
                 return -1;
             }
         }


     }



}
