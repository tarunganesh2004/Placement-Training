// https://learn.facecampus.org/fn/tcs-digital-advanced/learning/5f7875-LtTIcJ/
import java.util.*;
public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(mostValuable(a));
        sc.close();
    }

    public static int mostValuable(int[] a) {
        int maxSum = 0;
        int currentSum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                currentSum += a[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = a[i];
            }
        }
        maxSum = Math.max(maxSum, currentSum);
        return maxSum;
    }
}
