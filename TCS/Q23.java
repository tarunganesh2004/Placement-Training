import java.util.*;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int days = n/d;
        if (n % d != 0) {
            days++;
        }
        System.out.println(days+" Days");
        sc.close();

    }
}
