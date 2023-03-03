package baitap.ss11_dsa_stack_queue.check_bracket;

import java.util.Stack;

public class checkbracket {
    public static void main(String[] args) {
        String str = "())(";
        String[] arr = str.split("");
        Stack<String> stack = new Stack<>();
        boolean check = false;
        for (int i =0; i<arr.length; i++){
            if (arr[i]=="("){
                stack.push(arr[i]);
            }else {

            }
        }
    }
}
