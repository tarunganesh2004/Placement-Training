// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-sXwPcJ-IONk/#tc_
import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(minimumElements(a));
        sc.close();
    }

    public static int minimumElements(int[] a) {
        int n = a.length;
        int c = 0;

        if (a[0] != 2) {
            c++;
            a[0] = 2;
        }
        if (a[1] != 1) {
            c++;
            a[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            if (a[i] != a[i - 1] + a[i - 2]) {
                c++;
                a[i] = a[i - 1] + a[i - 2];
            }
        }

        return c;
    }
}
