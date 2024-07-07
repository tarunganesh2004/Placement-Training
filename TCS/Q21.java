import java.util.Arrays;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        // int max = 0;
        int sum = 0;
        if (a[0] * a[1] > a[n - 1] * a[n - 2]) {
            // max = a[0] * a[1];
            sum = a[0] + a[1];
        } else {
            // max = a[n - 1] * a[n - 2];
            sum= a[n-1]+a[n-2];
        }
        System.out.println(sum);
        sc.close();
    }

}
