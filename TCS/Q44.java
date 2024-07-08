// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-fxTIcJ-Sl2w/

import java.util.*;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(leastNumber(a));
        sc.close();
    }

    public static int leastNumber(int[] a) {
        int n = a.length;
    }
}
