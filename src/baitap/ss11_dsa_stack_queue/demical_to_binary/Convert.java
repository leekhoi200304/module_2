package baitap.ss11_dsa_stack_queue.demical_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number>0){
            int a = number%2;
            stack.push(a);
            number = number/2;
        }
        int s = stack.size();
        for (int i=0; i<s; i++){
            System.out.print(stack.pop());
        }

    }
}
