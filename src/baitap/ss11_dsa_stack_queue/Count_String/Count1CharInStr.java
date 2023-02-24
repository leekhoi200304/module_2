package baitap.ss11_dsa_stack_queue.Count_String;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count1CharInStr {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split("");
        for (String i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}
