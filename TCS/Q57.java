// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-e3xPcJ-WwtB/
// KnapSack Problem
import java.util.Scanner;

public class Q57 {

    public static int knap(int c, int w[], int p[], int n, int dp[][]) {
        if (n < 0 || c == 0) {
            return 0;
        }
        if (dp[n][c] != -1) {
            return dp[n][c];
        }
        if (w[n] > c) {
            return dp[n][c] = knap(c, w, p, n - 1, dp);
        } else {
            return dp[n][c] = Math.max(p[n] + knap(c - w[n], w, p, n - 1, dp), knap(c, w, p, n - 1, dp));
        }
    }
    static int knapSack(int c, int w[], int p[], int n) {
        int d[][] = new int[n + 1][c + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                d[i][j] = -1;
            }
        }
        return knap(c, w, p, n, d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt(); // capacity
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        System.out.println(knapSack(c,w,p,n-1));
        sc.close();
    }

    // public static int knapSack(int n, int c, int[] v, int w[]) {
    //     int maxProfit = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (w[i] <= c) {
    //             maxProfit = Math.max(maxProfit, v[i] + knapSack(n, c - w[i], v, w));
    //         }

    //     }
    //     return maxProfit;
    // }
}
