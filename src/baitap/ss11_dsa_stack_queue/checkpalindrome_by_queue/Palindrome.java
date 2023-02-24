package baitap.ss11_dsa_stack_queue.checkpalindrome_by_queue;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi vao day: ");
        String str = sc.nextLine();
        for (int i=0; i<str.length();i++){
            stack.push(str.charAt(i)+"");
            queue.offer(str.charAt(i)+"");
        }
        boolean check = false;
        for (int i=0; i<str.length(); i++)
            if (!stack.peek().equals(queue.peek())) {
                check = false;
            } else {
                check = true;
            }
        if (check){
            System.out.println("Chuoi tren la Palindrome");
        }else {
            System.out.println("Chuoi tren khong phai la Palindrome");
        }
    }
}
