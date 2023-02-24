package baitap.ss11_dsa_stack_queue.reverse_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStr {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhap mot chuoi: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }
        int num = stack.size();
        for (int i=0; i<num; i++){
            System.out.print(stack.pop());
        }
    }
}
