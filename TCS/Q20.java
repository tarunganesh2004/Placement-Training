// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-gcxPcJ-B415/

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
        
        sc.close();
    }

    public static void reverse(int n) {
        if (n > Math.pow(2, 15)|| n < Math.pow(-2, 15)) {
            System.out.println("Wrong value");
            return;
        }
        int rem = 0;
        int res = 0;
        while (n != 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        System.out.println(res);
    }
}
