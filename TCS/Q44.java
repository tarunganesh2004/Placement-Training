// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-fxTIcJ-Sl2w/

import java.util.*;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n]; // 1,0,1,1,1 --> 11000 --> 11111
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(leastNumber(a));
        sc.close();
    }

    public static int leastNumber(int[] a) { //
        int presses = 0;
        int currentState = 1; // all doors open
        for (int door : a) {
            if (door != currentState) {
                presses++;
                currentState = 1 - currentState;
            }
        }
        return presses;
    }
    
    // another method O(n^2)
    public static int leastNumber2(int[] a) {
        int presses = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                presses++;
                for (int j = i; j < a.length; j++) {
                    a[j] = 1 - a[i]; // toggle
                }
            }
        }
        return presses;
    }
}
