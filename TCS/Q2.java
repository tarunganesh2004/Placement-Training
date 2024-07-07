import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int s = x + y;
        if (z<=s&&z % gcd(x, y) == 0) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
