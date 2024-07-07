import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int e = sc.nextInt();
        int r = combination(n, p);
        int k = combination(m, e);
        int ans = r * k;
        System.out.println(ans);
        sc.close();
    }

    public static int combination(int a, int b) {
        int c = factorial(a) / (factorial(a - b) * factorial(b));
        return c;
    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }
}