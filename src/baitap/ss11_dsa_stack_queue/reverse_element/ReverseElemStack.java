package baitap.ss11_dsa_stack_queue.reverse_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElemStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] arr = new int[l];
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang truoc khi thay doi: ");
        for (int a1 : arr){
            System.out.print(a1 +"\t");
        }
        System.out.println();
        System.out.println("Mang sau khi thay doi: ");
        for (int i =0; i<arr.length; i++){
            stack.push(arr[i]);
        }
        int number = stack.size();
        for (int i =0; i<number; i++){
            arr[i] = stack.pop();
            System.out.print(arr[i] +"\t");
        }
    }
}
