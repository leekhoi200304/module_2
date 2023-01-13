package baitap;

public class DisplayPrimeNum {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 20) {
            int n = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    n = n + 1;
                }
            }
            if (n == 0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

