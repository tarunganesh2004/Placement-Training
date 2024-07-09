// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-0oTIcJ-m8TY/
import java.util.*;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        int current = c;
        int box=0;
        if (n > 0 && a[0] > 0) {
            box = 1;
        }
        for (int i = 0; i < n; i++) {
            if (current >= a[i]) {
                current -= a[i];
            } else {
                box++;
                current = c - a[i];
            }
        }
        System.out.println(box);
    }
}
